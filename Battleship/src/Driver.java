public class Driver {

    public static void main(String[]args){

    Ship titantic = new Ship (10.0, 5.0, "crewship", 10,3.0, 1.0, 4.0, 5.0);
    System.out.println (titantic.getX());

    Ship atlantis = new Ship (6.0, 3.0, "yacht", 5,5.0, 2.0, 3.0, 4.0);
    System.out.print (atlantis.getType());

    }

}

//if the attribute is static, then you would do Ship.x();
//if the attribute is private, do titanic.getX();
//if the attribute is public, do titanic.x(); no need to create get method because already public
//STD and math.pow is static, rand/scanner are dynamic (creating the object --> dynamic)

