package org.example;

public class Q1 {

    public int[] move(String commands){
      int[] coordinates = {0,0};
      String commandsArrayRegex;
      if (commands.contains("Up") || commands.contains("Down") || commands.contains("Left") || commands.contains("Right")){
         commandsArrayRegex = " ";
      }else{
          commandsArrayRegex = "";
      }
        String[]  commandsArray = commands.split(commandsArrayRegex);
        for (String command: commandsArray) {
            int moveAmount = 1;

            if (command.contains("2x")){
                moveAmount = 2;
                command = command.substring(2);

            }
            switch (command.toUpperCase()){
                case "U":
                case "UP":
                    coordinates[1] = coordinates[1] + moveAmount;
                    break;
                case "D":
                case "DOWN":
                    coordinates[1] = coordinates[1] - moveAmount;
                    break;
                case "L":
                case "LEFT":
                    coordinates[0] = coordinates[0] - moveAmount;
                    break;
                case "R":
                case "RIGHT":
                    coordinates[0] = coordinates[0] + moveAmount;
                    break;
            }
        }

        return coordinates;
    }

}
