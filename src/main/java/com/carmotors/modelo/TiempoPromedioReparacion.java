package com.carmotors.modelo;

public class TiempoPromedioReparacion {
    private final TipoMantenimiento tipo;
    private final long promedioMinutos;

    public TiempoPromedioReparacion(TipoMantenimiento tipo, long promedioMinutos) {
        this.tipo = tipo;
        this.promedioMinutos = promedioMinutos;
    }

    public TipoMantenimiento getTipo() {
        return tipo;
    }

    public long getPromedioMinutos() {
        return promedioMinutos;
    }
}