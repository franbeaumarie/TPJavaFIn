import java.util.*;

public class TPManager {

    private final Map<Student, HashSet<TP>> tps = new HashMap<>();

    private final PriorityQueue<TP> queue = new PriorityQueue<TP>(
            new Comparator<TP>(){
                @Override
                public int compare(TP o1, TP o2) {
                    return o1.getStudent().getPromedio() != o2.getStudent().getPromedio()
                            ? -Integer.compare(o1.getStudent().getPromedio(), o2.getStudent().getPromedio())
                            : -Integer.compare(o1.getStudent().getOrden(), o2.getStudent().getOrden());
                }});

    public void deliver(TP tp) {

        queue.add(tp);

        if(!tps.containsKey(tp.getStudent()))
            tps.put(tp.getStudent(), new HashSet<TP>());

        tps.get(tp.getStudent()).add(tp);
    }

    public TP correct() throws EmptyTPsException{

        TP a =  queue.poll();

        if (a != null)
        {

        if (!tps.get(a.getStudent()).isEmpty())
            tps.get(a.getStudent()).remove(a);

        if (tps.get(a.getStudent()).isEmpty())
            tps.remove(a.getStudent());

                return a;
        }

        throw new EmptyTPsException();
    }

    public boolean isEmpty() { return queue.isEmpty(); }

    public String studentsTps() { return tps.toString() ; }
}
