import java.util.ArrayList;

public class Z_TestDriver {
    public static void main(String[] args){
        EntityManager.init();
        ComponentManager.init();
        Entity e = EntityManager.addEntityRetEntity();
        Component_Position pComp = new Component_Position(new Vector(0, 0));
        ComponentManager.setComponent(pComp, e.getEntityID());
        ComponentManager.setComponent(new Component_Movement(new MoveModeAddVector("velocity", new Vector(10, 10))), e.getEntityID());
        System_EntityMovement sys = new System_EntityMovement();
        ArrayList<Entity> al = new ArrayList<>();
        al.add(e);
        for(int i = 0; i < 1000; i++) {
            sys.update(al);
        }
    }
}