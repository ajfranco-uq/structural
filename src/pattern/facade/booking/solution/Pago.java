package pattern.facade.booking.solution;

// ============================================================
// SUBSISTEMA: PAGO
// ============================================================

class Pago {

    public boolean registrarAbono(double total, double abono) {

        if (abono <= 0) {
            System.out.println("El abono debe ser mayor que $0");
            return false;
        }

        if (abono > total) {
            System.out.println(
                    "El abono no puede ser mayor al total de la reserva"
            );
            return false;
        }

        double pendiente = total - abono;

        System.out.println("Total de la reserva: $" + total);
        System.out.println("Abono realizado: $" + abono);
        System.out.println("Saldo pendiente: $" + pendiente);

        return true;
    }
}