package seedu.address.model.room;

import java.util.List;

import seedu.address.model.room.booking.Bookings;
import seedu.address.model.person.Guest;

/**
 * Represents a Double Room in the hotel.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class DoubleRoom extends Room {
    public static final Capacity CAPACITY_DOUBLE_ROOM = new Capacity(2);

    /**
     * All parameters must be non-null.
     * Note: {@code expenses}, or {@code bookings} may be empty, but not null.
     */
    public DoubleRoom(RoomNumber roomNumber, Expenses expenses, Bookings bookings) {
        super(roomNumber, CAPACITY_DOUBLE_ROOM, expenses, bookings);
    }
}
