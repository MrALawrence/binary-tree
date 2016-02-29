import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreeTest {
    @Test
    public void it_should_create_an_empty_bst(){
        BinarySearchTree bst = new BinarySearchTree();

        assertEquals(bst.getRoot(), null);
    }

    @Test
    public void it_should_set_root_node_as_the_first_value_given(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(5);

        assertEquals(bst.getRoot().getValue(), 5);
    }

    @Test
    public void it_should_add_a_smaller_value_as_the_root_node_left_branch(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(25);

        assertEquals(bst.getRoot().getLeft().getValue(), 25);
    }

    @Test
    public void it_should_add_a_larger_value_as_the_root_node_right_branch(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(75);

        assertEquals(bst.getRoot().getRight().getValue(), 75);
    }

    @Test
    public void it_should_continue_adding_smaller_values_as_the_left_branch(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(25);
        bst.addElement(15);

        assertEquals(bst.getRoot().getLeft().getLeft().getValue(), 15);
    }

    @Test
    public void it_should_continue_adding_larger_values_as_the_right_branch(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(75);
        bst.addElement(92);

        assertEquals(bst.getRoot().getRight().getRight().getValue(), 92);
    }

    @Test
    public void it_should_treat_equal_values_as_less_than_and_add_to_the_left(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(40);

        assertEquals(bst.getRoot().getLeft().getValue(), 40);
    }

    @Test
    public void it_should_return_zero_for_min_on_an_empty_bst(){
        BinarySearchTree bst = new BinarySearchTree();

        assertEquals(bst.min(), 0);
    }

    @Test
    public void it_returns_the_min_value_with_only_one_tree_element(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(25);

        assertEquals(bst.min(), 25);
    }

    @Test
    public void it_returns_the_min_value_with_only_left_branch_tree_elements(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(25);
        bst.addElement(12);

        assertEquals(bst.min(), 12);
    }

    @Test
    public void it_returns_the_min_value_with_multiple_tree_elements(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(25);
        bst.addElement(12);
        bst.addElement(5);
        bst.addElement(9);
        bst.addElement(18);
        bst.addElement(36);
        bst.addElement(75);

        assertEquals(bst.min(), 5);
    }

    @Test
    public void it_should_return_zero_for_max_on_an_empty_bst(){
        BinarySearchTree bst = new BinarySearchTree();

        assertEquals(bst.max(), 0);
    }

    @Test
    public void it_returns_the_max_value_with_only_one_tree_element(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(25);

        assertEquals(bst.max(), 25);
    }

    @Test
    public void it_returns_the_max_value_with_only_right_branch_tree_elements(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(25);
        bst.addElement(36);

        assertEquals(bst.max(), 36);
    }

    @Test
    public void it_returns_the_max_value_with_multiple_tree_elements(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(25);
        bst.addElement(12);
        bst.addElement(5);
        bst.addElement(9);
        bst.addElement(18);
        bst.addElement(36);
        bst.addElement(75);

        assertEquals(bst.max(), 75);
    }

    @Test
    public void it_returns_the_correct_size_of_a_tree_with_no_values(){
        BinarySearchTree bst = new BinarySearchTree();

        assertEquals(bst.size(), 0);
    }

    @Test
    public void it_returns_the_correct_size_of_a_tree_with_one_value(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(5);

        assertEquals(bst.size(), 1);
    }

    @Test
    public void it_returns_the_correct_size_of_a_tree_with_multiple_value(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(15);
        bst.addElement(5);
        bst.addElement(12);
        bst.addElement(20);

        assertEquals(bst.size(), 4);
    }

    @Test
    public void it_returns_the_correct_inorder_traversal_on_an_empty_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        assertEquals("", bst.inOrder());
    }

    @Test
    public void it_returns_the_correct_inorder_traversal_on_a_single_value_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(5);

        assertEquals("5", bst.inOrder());
    }

    @Test
    public void it_returns_the_correct_inorder_traversal_on_a_balanced_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(25);
        bst.addElement(12);
        bst.addElement(28);
        bst.addElement(75);
        bst.addElement(92);
        bst.addElement(61);

        assertEquals("12, 25, 28, 40, 61, 75, 92", bst.inOrder());
    }

    @Test
    public void it_returns_the_correct_inorder_traversal_on_an_ubalanced_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(25);
        bst.addElement(12);
        bst.addElement(75);
        bst.addElement(92);
        bst.addElement(61);

        assertEquals("12, 25, 40, 61, 75, 92", bst.inOrder());
    }

    @Test
    public void it_returns_the_correct_preorder_traversal_on_an_empty_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        assertEquals("", bst.preOrder());
    }

    @Test
    public void it_returns_the_correct_preorder_traversal_on_a_single_value_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(5);

        assertEquals("5", bst.preOrder());
    }

    @Test
    public void it_returns_the_correct_preorder_traversal_on_a_balanced_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(25);
        bst.addElement(12);
        bst.addElement(28);
        bst.addElement(75);
        bst.addElement(92);
        bst.addElement(61);

        assertEquals("40, 25, 12, 28, 75, 61, 92", bst.preOrder());
    }

    @Test
    public void it_returns_the_correct_preorder_traversal_on_an_ubalanced_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(25);
        bst.addElement(12);
        bst.addElement(75);
        bst.addElement(92);
        bst.addElement(61);

        assertEquals("40, 25, 12, 75, 61, 92", bst.preOrder());
    }


    @Test
    public void it_returns_the_correct_postorder_traversal_on_an_empty_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        assertEquals("", bst.postOrder());
    }

    @Test
    public void it_returns_the_correct_postorder_traversal_on_a_single_value_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(5);

        assertEquals("5", bst.postOrder());
    }

    @Test
    public void it_returns_the_correct_postorder_traversal_on_a_balanced_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(25);
        bst.addElement(12);
        bst.addElement(28);
        bst.addElement(75);
        bst.addElement(92);
        bst.addElement(61);

        assertEquals("12, 28, 25, 61, 92, 75, 40", bst.postOrder());
    }

    @Test
    public void it_returns_the_correct_postorder_traversal_on_an_ubalanced_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(25);
        bst.addElement(12);
        bst.addElement(75);
        bst.addElement(92);
        bst.addElement(61);

        assertEquals("12, 25, 61, 92, 75, 40", bst.postOrder());
    }

    @Test
    public void it_returns_the_correct_level_order_traversal_on_an_empty_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        assertEquals("", bst.levelOrder());
    }

    @Test
    public void it_returns_the_correct_level_order_traversal_on_a_single_value_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(5);

        assertEquals("5", bst.levelOrder());
    }

    @Test
    public void it_returns_the_correct_level_order_traversal_on_a_balanced_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(25);
        bst.addElement(12);
        bst.addElement(28);
        bst.addElement(75);
        bst.addElement(92);
        bst.addElement(61);

        assertEquals("40, 25, 75, 12, 28, 61, 92", bst.levelOrder());
    }

    @Test
    public void it_returns_the_correct_level_order_traversal_on_an_unbalanced_tree(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.addElement(40);
        bst.addElement(25);
        bst.addElement(12);
        bst.addElement(75);
        bst.addElement(92);
        bst.addElement(61);

        assertEquals("40, 25, 75, 12, 61, 92", bst.levelOrder());
    }

}
