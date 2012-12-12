package graph;

public class BasicEdge implements Edge {

    private final long id;
    private final String name;

    private final Vertex tail;
    private final Vertex head;

    private final Long capacity;

    private BasicEdge(Vertex tail, Vertex head, Long capacity) {
        this.id = IdFactory.getId();
        this.name = tail.getName() + " -> " + head.getName();
        this.tail = tail;
        this.head = head;
        this.capacity = capacity;
    }

    public static BasicEdge create(Vertex tail, Vertex head, Long capacity) {
        return new BasicEdge(tail, head, capacity);
    }

    @Override
    public Vertex getTail() {
        return tail;
    }

    @Override
    public Vertex getHead() {
        return head;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getCapacity() {
        return capacity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BasicEdge other = (BasicEdge) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
