package org.example.wcs.java._04;


public class Movies {
    public static void main(String[] args) {
        String[] titles = {
            "Les Aventuriers de l'Arche perdue",
            "Indiana Jones et le Temple maudit",
            "Indiana Jones et la dernière croisade",
            "Indiana Jones et le Royaume du Crâne de Cristal",
        };
        String[][] actors = {
            {"Harrison Ford", "Karen Allen", "Paul Freeman"},
            {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
            {"Harrison Ford", "Sean Connery", "John Rhys-Davies"},
            {"Harrison Ford", "Cate Blanchett", "Shia Saide LaBeouf"},
        };

        for (int i = 0; i < titles.length; i++) {
            System.out.print(
                "Dans le film " +
                titles[i] +
                ", les principaux acteurs sont : "
            );

            for (int j = 0; j < actors[i].length; j++) {
                System.out.print(actors[i][j]);
                if (j < actors[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
