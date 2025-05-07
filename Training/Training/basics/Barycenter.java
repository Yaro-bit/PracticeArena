package basics;



public class Barycenter {

    public static double[] barTriang(double[] A, double[] B, double[] C) {
        
        double centerX = Math.round(((A[0] + B[0] + C[0]) / 3) * 10000) / 10000.0;
        double centerY = Math.round(((A[1] + B[1] + C[1]) / 3) * 10000) / 10000.0;

       
        double[] center = {centerX, centerY};
        return center;
    }
}
//Die Seitenhalbierenden eines Dreiecks sind die Strecken, die die Eckpunkte mit den Mittelpunkten der gegenüberliegenden Seiten verbinden. Die drei Seitenhalbierenden eines Dreiecks schneiden sich in einem gemeinsamen Punkt, 
//der als Schwerpunkt oder Baryzentrum bezeichnet wird. Gegeben ein Dreieck, das durch die kartesischen Koordinaten seiner Eckpunkte definiert ist, müssen wir dessen Schwerpunkt (Baryzentrum) lokalisieren.
//Die Funktion bar_triang() oder barTriang oder bar-triang erhält die Koordinaten der drei Eckpunkte A, B und C als drei verschiedene Argumente und gibt die Koordinaten des Schwerpunkts O in einem Array [xO, yO] zurück.
//So sollte die gewünschte Funktion funktionieren: Die Ergebnisse der Koordinaten sollen auf vier Dezimalstellen genau angegeben werden (gerundetes Ergebnis).
//Für weitere Informationen zu diesem wichtigen Punkt eines Dreiecks siehe: (https://en.wikipedia.org/wiki/Centroid)
//Schauen wir uns einige Beispiele an:
//barTriang([4, 6], [12, 4], [10, 10]) ------> {8.6667, 6.6667}
//barTriang([4, 2], [12, 2], [6, 10]) ------> {7.3333, 4.6667}
//Die gegebenen Punkte bilden entweder ein echtes oder ein entartetes Dreieck, aber in jedem Fall können die obigen Formeln angewendet werden.
