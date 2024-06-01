package gt.com.tarea.estructuras;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Factura {
    private String numero;
    private String fecha;
    private String nombre;
    private String nit;
    private String telefono;
    private String monto;
}
