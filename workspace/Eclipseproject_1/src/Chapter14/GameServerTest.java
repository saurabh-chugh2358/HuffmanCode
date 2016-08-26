package Chapter14;
import java.io.*;

public class GameServerTest implements Serializable{

      public static void main(String[] args) {
            GameCharacter one = new GameCharacter(50, "Elf", new String [] {"bow", "sword", "dust"});
            GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big axe"});
            GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"});

            try {
                  ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
                  os.writeObject(one);
                  os.writeObject(two);
                  os.writeObject(three);
                  os.close();
            }catch (Exception ex){ex.printStackTrace();}

            one = null;
            two = null;
            three = null;
            try{
                  ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
                  GameCharacter oneRestore = (GameCharacter) is.readObject();
                  GameCharacter twoRestore = (GameCharacter) is.readObject();
                  GameCharacter threeRestore = (GameCharacter) is.readObject();
                  
                  System.out.println("one's type is :" + oneRestore.getType());
                  System.out.println("two's type is :" + twoRestore.getType());
                  System.out.println("three's type is :" + threeRestore.getType());
                  
            }catch (Exception ex){ex.printStackTrace();}

            
      }
}

class GameCharacter implements Serializable{
      int power;
      String type;
      String[] weapons;

      public GameCharacter (int p, String t, String[] w){
            power = p;
            type = t;
            weapons = w;
      }

      public void getWeapon() {}
      public String getType() {return type;}
      public void useWeapon() {}
      public void IncreasePower() {}
}
