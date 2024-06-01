package gt.com.tarea.estructuras;

/**
 *
 * @author Hp Omen
 */

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Alumno {
    private String numero;
    private String nombre;
    private String carnet;
    private String fechaNacimiento;
    private String telefono;
    private String monto;
}
