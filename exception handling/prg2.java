class Guest:
    def __init__(self, name):
        self.name = name

class Reservation:
    def __init__(self, guest, room_type, check_in, check_out):
        self.guest = guest
        self.room_type = room_type
        self.check_in = check_in
        self.check_out = check_out

class InvalidReservationException(Exception):
    pass

class Hotel:
    def __init__(self):
        self.guests = []
        self.reservations = []

    def add_guest(self, name):
        guest = Guest(name)
        self.guests.append(guest)

    def make_reservation(self, guest_name, room_type, check_in, check_out):
        guest = next((g for g in self.guests if g.name == guest_name), None)
        if guest is None:
            raise InvalidReservationException("Guest not found.")
        
        reservation = Reservation(guest, room_type, check_in, check_out)
        self.reservations.append(reservation)

    def list_reservations(self):
        for reservation in self.reservations:
            print(f"Guest: {reservation.guest.name}, Room Type: {reservation.room_type}, Check-in: {reservation.check_in}, Check-out: {reservation.check_out}")

# Example usage:
try:
    hotel = Hotel()

    hotel.add_guest("Alice")
    hotel.add_guest("Bob")

    hotel.make_reservation("Alice", "Standard", "2023-09-10", "2023-09-15")
    hotel.make_reservation("Bob", "Deluxe", "2023-09-12", "2023-09-17")

    hotel.list_reservations()

except InvalidReservationException as e:
    print(f"Error: {e}")