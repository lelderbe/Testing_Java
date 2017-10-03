/**
 * Created by user on 12.03.2016.
 */
public class Types {

    public static void main(String[] args) {

//        Object obj = new Cat();
//
//        System.out.println(obj instanceof Pet);
//        System.out.println(obj instanceof Cat);
//        System.out.println(obj instanceof Tiger);
//
//        Pet pet = (Pet) obj;
//
//        Cat pet2 = (Cat) obj;
//
//        System.out.println(pet instanceof Pet);
//        System.out.println(pet instanceof Cat);
//        System.out.println(pet instanceof Tiger);
//
//        Pet pet3 = new Tiger();

        Pet pet = new Pet();
        pet.shared();

        Cat cat = new Cat();
        cat.shared();

    }


}


class Pet
{

    public Pet() {

    }

    public void shared() {
        System.out.println(this);
    }

    public void doPetActions() {};
}

class Cat extends Pet
{
    @Override
    public void shared() {
        super.shared();
    }

    public void doCatActions() {};
}

class Tiger extends Cat
{
    public void doTigerActions() {};
}
