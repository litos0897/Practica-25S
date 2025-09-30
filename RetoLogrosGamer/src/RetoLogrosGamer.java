import static java.lang.Math.max;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RetoLogrosGamer {
    public static void main(String[] args) {


        // ============================================================

        // RETO FINAL – Mini sistema de logros (multijuego)

        // ============================================================

        // OBJETIVO:

        // Implementa un sistema que, a partir de estadísticas de una partida,

        // calcule y muestre los LOGROS desbloqueados por el jugador.

        //

        // ------------------------------------------------------------

        // 1) DECLARA ESTAS VARIABLES DE ENTRADA (asigna valores fijos para probar):

        //    - String juego: "Fortnite", "LoL", "Minecraft", "Pokemon"

        //    - int kills

        //    - int muertes

        //    - int asistencias

        //    - int tiempoMin: minutos jugados

        //    - int objetivos: (torres destruidas, bosses, capturas, construcciones…)

        //    - boolean desconexion: true si el jugador se desconectó en mitad

        //    - int dañoHecho

        //    - int dañoRecibido

        //    - int oro: moneda conseguida

        //

        // ------------------------------------------------------------


        // 2) NORMAS GENERALES (usa if / else if / else y condiciones compuestas):

        //    - Si desconexion es true y tiempoMin < 5 → imprimir:

        //         "Logro NEGATIVO: Rage Quit 😠"

        //      IMPORTANTE: si ocurre esto, NO concedas otros logros de "PRO"

        //      en la misma partida (prioridad negativa).

        //

        //    - Calcula KDA = (kills + asistencias) / max(1, muertes)

        //      (evita división por 0 usando Math.max).

        //

        //    - Clasificación por KDA (elige SOLO UNA, la primera que cumpla):

        //        KDA ≥ 5          → "Jugador PRO"

        //        3 ≤ KDA < 5      → "Jugador BUENO"

        //        1 ≤ KDA < 3      → "Jugador NORMAL"

        //        KDA < 1          → "Jugador NOOB"

        //

        //    - Logros básicos independientes (pueden acumularse):

        //        kills >= 10                    → "Logro: Cazador experto 🏹"

        //        muertes == 0 && kills >= 5     → "Logro: Intocable 👑"

        //        tiempoMin > 60                 → "Logro: Maratón gamer ⏱️"

        //        dañoHecho > dañoRecibido*2     → "Logro: Dominio total 💥"

        //        objetivos >= 3                 → "Logro: Objetivos de mapa 🎯"

        //

        // ------------------------------------------------------------

        // 3) REGLAS ESPECÍFICAS POR JUEGO (selecciona por valor de 'juego'):

        //    - Fortnite:

        //        si kills >= 15 && muertes <= 2 → "Victoria agresiva (Fortnite) 🔫"

        //        si oro >= 2000                 → "Ahorrista de V-Bucks (Fortnite) 💰"

        //

        //    - LoL:

        //        si objetivos >= 2 && asistencias >= 10 → "Shotcaller (LoL) 🗣️"

        //        si dañoHecho >= 30000 && muertes <= 3  → "Carry principal (LoL) 🛡️"

        //

        //    - Minecraft:

        //        si tiempoMin >= 45 && dañoRecibido == 0 → "Superviviente pacífico (MC) 🌿"

        //        si objetivos >= 5                        → "Constructor incansable (MC) 🧱"

        //

        //    - Pokemon:

        //        si kills >= 6 && dañoRecibido <= 1000 → "Entrenador maestro (PKMN) 🧢"

        //        si asistencias >= 3                   → "Apoyo del equipo (PKMN) 🤝"

        //

        // ------------------------------------------------------------

        // 4) PRIORIDADES Y EXCLUSIONES (orden y anidación de if):

        //    - Si se activa "Rage Quit 😠", NO mostrar "Jugador PRO".

        //    - Si muertes == 0 && kills == 0 && asistencias == 0 && tiempoMin < 2:

        //        imprimir "Partida inválida: AFK" y NO mostrar más logros.

        //

        // ------------------------------------------------------------

        // 5) SALIDA (impresiones sugeridas):

        //    - Resumen de entrada (todas las estadísticas)

        //    - KDA calculado

        //    - Rango por KDA (solo uno)

        //    - Lista de logros desbloqueados (varios posibles)

        //    - Mensajes de exclusión si corresponde (p. ej., Rage Quit / AFK)

        //

        // ------------------------------------------------------------

        // 6) PRUEBAS RÁPIDAS (cambia las variables y ejecuta varias veces):

        //    CASO A: LoL, kills=12, muertes=2, asist=15, tiempo=38, obj=3, desc=false, dañoH=32000, dañoR=9000, oro=1500

        //    CASO B: Fortnite, kills=16, muertes=2, asist=3, tiempo=25, obj=1, desc=false, dañoH=18000, dañoR=6000, oro=2300

        //    CASO C: Minecraft, kills=0, muertes=0, asist=0, tiempo=1, obj=0, desc=false, dañoH=0, dañoR=0, oro=0

        //    CASO D: Pokemon, kills=7, muertes=0, asist=4, tiempo=50, obj=2, desc=false, dañoH=5000, dañoR=800, oro=800

        //    CASO E: (cualquier juego), desconexion=true, tiempoMin=3

        //

        // ------------------------------------------------------------

        // 7) EXTENSIONES OPCIONALES (sube dificultad):

        //    - Suma un "score" total: +10 por logro normal, +20 por logros PRO.

        //    - Si score ≥ 40 y no hubo Rage Quit → "MVP de la jornada 🏆".

        //    - Si dañoRecibido == 0 y tiempoMin ≥ 30 → "Perfect Defense 🧱".

        //    - Si (juego == "LoL" || juego == "Fortnite") && (kills + asistencias) ≥ 25 → "Impacto masivo 🌪️".

        //    - Prioriza validaciones: AFK y Rage Quit antes que el resto.

        //    - Usa if anidados para practicar flujo de decisión.

        //

        // ------------------------------------------------------------

        // PISTAS TÉCNICAS:

        //    - Usa double para KDA (decimales).

        //    - Usa Math.max(1, muertes) para evitar dividir por cero.

        //    - Estructura tu código por bloques: validaciones iniciales → KDA → logros básicos → logros por juego → extras.

        //

        // ------------------------------------------------------------

        // IMPLEMENTACIÓN:

        //  - Escribe debajo tu solución con muchos if/else if/else.

        //  - No uses arrays ni bucles (opcional), céntrate en condiciones.

        //  - Ejecuta varias veces cambiando los valores de entrada.


        // ======= TU CÓDIGO AQUÍ =======

        String juego = "Fortnite";
        int kills = 28;
        int muertes = 1;
        int asistencias = 8;
        int tiempoMin = 80;
        int objetivos = 1;
        boolean desconexion = true;
        int danhoHecho = 359;
        int danhoRecibido = 102;
        int oro = 3500;

        if (muertes == 0 && kills == 0 && asistencias == 0 && tiempoMin < 2) {
            System.out.println("Partida inválida: AFK 🚪");
        } else {
            boolean rageQuit = true;
            if (desconexion && tiempoMin < 5) {
                System.out.println("Logro NEGATIVO: Rage Quit 😠");
                rageQuit = true;

            }
            double KDA = (kills + asistencias / max(1, muertes));
            if (KDA >= 5) {
                System.out.println("Jugador PRO");

                if (3 <= KDA && KDA < 5) {
                    System.out.println("Jugador BUENO");
                } else if (1 <= KDA && KDA < 3) {
                    System.out.println("Jugador NORMAL");
                } else if (KDA < 1) {
                    System.out.println("Jugador NOOB");
                }
                if (kills >= 10) {
                    System.out.println("Logro: Cazador experto 🏹");
                }
                if (muertes == 0 && kills >= 5) {
                    System.out.println("Logro: Intocable");
                }
                if (tiempoMin > 60) {
                    System.out.println("Logro: Maratón gamer ⏱️");
                }
                if (danhoHecho > danhoRecibido * 2) {
                    System.out.println("Logro: Dominio total 💥");
                }
                if (objetivos >= 3) {
                    System.out.println("Logro: Objetivos de mapa 🎯");
                }
                if (juego == "Fortnite") {

                    if (kills >= 15 && muertes <= 2) {
                        System.out.println("Victoria agresiva (Fortnite) 🔫");
                    }
                    if (oro >= 2000) {
                        System.out.println("Ahorrista de V-Bucks (Fortnite) 💰");

                    } else if (juego == "Minecraft") {

                        if (objetivos >= 2 && asistencias >= 10) {
                            System.out.println("Shotcaller (LoL) 🗣️");
                        }
                        if (tiempoMin >= 45 && danhoRecibido == 0) {
                            System.out.println("Superviviente pacífico (MC) 🌿");
                        }
                        if (objetivos >= 5) {
                            System.out.println("Constructor incansable (MC) 🧱");
                        }
                        if (kills >= 6 && danhoRecibido <= 1000) {
                            System.out.println("Entrenador maestro (PKMN) 🧢");
                        }
                        if (asistencias >= 3) {
                            System.out.println("Apoyo del equipo (PKMN) 🤝");
                        }

                    }

                    System.out.println("El jugador tiene " + kills + " + kills, " + muertes + " muertes, " + asistencias + " asistencias, con un tiempo de juego de " + tiempoMin + " minutos, habiendo cumplido " + danhoHecho + " objetivo, habiendo hecho " + danhoRecibido + " de daño, 102 de daño recibido y obteniendo " + oro + " de oro.");
                    System.out.println("El KDA del jugador es de " + KDA);

                    System.out.println("======LISTA DE TROFEOS======");
                    if (kills >= 10) ;
                    System.out.println("Logro: Cazador experto 🏹");
                    if (danhoRecibido > danhoRecibido * 2) ;
                    System.out.println("Logro: Dominio total 💥");

                    System.out.println(("======MENSAJES DE EXCLUSIÓN======"));
                    if (rageQuit == true) ;
                    System.out.println("Logro NEGATIVO: Rage Quit 😠");
                    if (muertes == 0 && kills == 0 && asistencias == 0 && tiempoMin < 2) ;
                    System.out.println("Partida inválida: AFK");

                    int score = 0;
                    if (kills >= 10) score += 10;
                    if (muertes == 0 && kills >= 5) score += 10;
                    if (tiempoMin > 60) score += 10;
                    if (danhoHecho > danhoRecibido * 2) score += 10;
                    if (kills >= 15 && muertes <= 2) score += 20;
                    if (oro >= 2000) score += 20;
                    if (score >= 40 && !rageQuit);
                    System.out.println("MVP de la jornada 🏆");
                    if (danhoRecibido == 0 && tiempoMin < 30);
                    System.out.println("Perfect Defense 🧱");
                    if (juego == "LOL"||juego == "Fortnite" && kills + asistencias >=25);
                    System.out.println("Impacto masivo 🌪️");

}
}
}
}
}
