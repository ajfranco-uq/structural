package pattern.facade.booking.solution;

// ============================================================
// CLIENTE
// ============================================================

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        HotelFacade hotel = new HotelFacade();

        // Primera reserva
        hotel.reservarHabitacion(
                "Andres",
                205,
                LocalDate.of(2026, 9, 10),
                LocalDate.of(2026, 9, 13),
                200000

        );

        System.out.println();

        // Intentamos reservar la misma habitación
        // durante fechas que se cruzan con la primera reserva
        hotel.reservarHabitacion(
                "Carlos",
                205,
                LocalDate.of(2026, 9, 12),
                LocalDate.of(2026, 9, 15),
                100000
        );

        System.out.println();

        // Esta sí debería funcionar porque las fechas
        // no se cruzan con la primera reserva
        hotel.reservarHabitacion(
                "Maria",
                205,
                LocalDate.of(2026, 9, 13),
                LocalDate.of(2026, 9, 15),
                150000
        );
    }
}