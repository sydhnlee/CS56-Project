public class BodyPart {

    String name;
    
    //Position(left or right) and status(injured, fine, sprained...etc) in case making list for user body parts as well
    String position;
    String status; 
    
    BodyPart partList[];
    
    BodyPart(String name, String position, String status)
    {
        this.name = name;
        this.status = status;
        this.position = position;
    }
    
    BodyPart(String name, String status)
    {
        this.name = name;
        this.status = status;
    }
    
    BodyPart(String name)
    {
       this.name = name;
    }
    
    String getName() 
    {
        return name;
    }
    
    String getPosition() 
    {
        return position;
    }
    
    String getStatus() 
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    private void createList(String name)
    {
        
    }
    @Override
    public String toString() {
        return name + "\n" + position + "\n" + status;
    }
}

class Head extends BodyPart{

    Head(String name, String status) {
        super(name, status);
    }
    
}

class Neck extends BodyPart{

    Neck(String name, String status) {
        super(name, status);
    }

    
}

class Shoulder extends BodyPart{

    Shoulder(String name, String position, String status) {
        super(name, position, status);
    }
    
}

class Arm extends BodyPart{

    Arm(String name, String position, String status) {
        super(name, position, status);
    }
    
}

class Tricep extends BodyPart{

    Tricep(String name, String position, String status) {
        super(name, position, status);
    }
    
}

class Hand extends BodyPart{

    Hand(String name, String position, String status) {
        super(name, position, status);
    }
    
}


class Wrist extends BodyPart{

    Wrist(String name, String position, String status) {
        super(name, position, status);
    }
    
}

class Bicep extends BodyPart{

    Bicep(String name, String position, String status) {
        super(name, position, status);
    }
    
}

class Chest extends BodyPart{

    Chest(String name, String status) {
        super(name, status);
        // TODO Auto-generated constructor stub
    }
    
}

class Trap extends BodyPart{

    Trap(String name, String position, String status) {
        super(name, position, status);
    }
    
}


class Waist extends BodyPart{

    Waist(String name, String status) {
        super(name, status);
    }
    
}

class Abdomen extends BodyPart{

    Abdomen(String name, String status) {
        super(name, status);
    }
    
}

class Back extends BodyPart{

    Back(String name, String status) {
        super(name, status);
    }
    
}

class Hip extends BodyPart{

    Hip(String name, String position, String status) {
        super(name, position, status);
    }
    
}


class Buttocks extends BodyPart{

    Buttocks(String name, String position, String status) {
        super(name, position, status);
    }
    
}


class Leg extends BodyPart{

    Leg(String name, String position, String status) {
        super(name, position, status);
    }
    
}


class Thigh extends BodyPart{

    Thigh(String name, String position, String status) {
        super(name, position, status);
    }
    
}


class Knee extends BodyPart{

    Knee(String name, String position, String status) {
        super(name, position, status);
    }
    
}


class Calf extends BodyPart{

    Calf(String name, String position, String status) {
        super(name, position, status);
    }
    
}


class Foot extends BodyPart{

    Foot(String name, String position, String status) {
        super(name, position, status);
    }
    
}
