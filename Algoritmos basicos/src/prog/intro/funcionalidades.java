package prog.intro;

import java.util.Arrays;

public class funcionalidades {

    public static Long cuantosCochesConLetraDada(Concesionario c, Character letra) {
        Long cantidad;
        cantidad = 0l;
        for (Integer i = 0; i < c.nCoches; i++) {
            if (c.coches[i].matricula[4] == letra ||
                    c.coches[i].matricula[5] == letra ||
                    c.coches[i].matricula[6] == letra) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public static Long cuantosCochesConLetraDada2(Concesionario c, Character letra) {
        Long cantidad;
        cantidad = 0l;
        for (Integer i = 0; i < c.nCoches; i++) {
            if (tieneLetra(c.coches[i], letra)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public static Boolean tieneLetra(Coche cch, Character letra) {
        return cch.matricula[4] == letra || cch.matricula[5] == letra || cch.matricula[6] == letra;
    }

    public static Long cuantosCochesConLetraDada3(Concesionario c, Character letra) {
        Long cantidad;
        cantidad = 0l;
        for (Integer i = 0; i < c.nCoches; i++) {
            if (tieneLetra2(c.coches[i], letra, 4, 7)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public static Boolean tieneLetra2(Coche cch, Character letra, Integer init, Integer end) {
        boolean tiene = false;
        for (Integer i = init; i < end; i++) {
            if (cch.matricula[i] == letra) {
                tiene = true;
            }
        }
        return tiene;
    }


    public static Long cuantosCochesConLetraDada4(Concesionario c, Character letra) {
        Long cantidad;
        cantidad = 0l;
        for (Integer i = 0; i < c.nCoches; i++) {
            if (tieneLetra3(c.coches[i], letra, 4, 7)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public static Boolean tieneLetra3(Coche cch, Character letra, Integer init, Integer end) {
        Boolean tiene = false;
        for (Integer i = init; i < end; i++) {
            if (esLetra(cch, letra, i)) {
                tiene = true;
            }
        }
        return tiene;
    }

    public static Boolean esLetra(Coche cch, Character letra, Integer pos) {
        return cch.matricula[pos] == letra;
    }

    public static Boolean tieneLetra4(Coche cch, Character letra, Integer init, Integer end) {
        return Arrays.stream(cch.matricula, init, end).filter(ch -> ch == letra).count() > 0;
    }

    public static Boolean tieneLetra5(Coche cch, Character letra, Integer init, Integer end) {
        return Arrays.stream(cch.matricula, init, end).anyMatch(ch -> ch == letra);
    }

    public static Long cuantosCochesConLetraDada5(Concesionario c, Character letra) {
        Long cantidad;
        cantidad = 0l;
        for (Integer i = 0; i < c.nCoches; i++) {
            if (tieneLetra4(c.coches[i], letra, 4, 7)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public static Long cuantosCochesConLetraDada6(Concesionario c, Character letra) {
        return Arrays.stream(c.coches).filter(cch -> tieneLetra(cch, letra)).count();
    }

}
