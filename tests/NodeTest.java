import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodeTest {
    @Test
    public void it_should_store_its_value() {
        Node n = new Node(5);

        assertEquals(5, n.getValue());
    }
}
