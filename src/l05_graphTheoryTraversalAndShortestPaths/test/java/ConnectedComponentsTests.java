package l05_graphTheoryTraversalAndShortestPaths.test.java;

import l05_graphTheoryTraversalAndShortestPaths.main.java.Main;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ConnectedComponentsTests {

    @Test
    public void TestGraphConnectedComponents9Vertices() {
        // Arrange
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(new ArrayList<>(Arrays.asList(3, 6)));
        graph.add(new ArrayList<>(Arrays.asList(3, 4, 5, 6)));
        graph.add(new ArrayList<>(Collections.singletonList(8)));
        graph.add(new ArrayList<>(Arrays.asList(0, 1, 5)));
        graph.add(new ArrayList<>(Arrays.asList(1, 6)));
        graph.add(new ArrayList<>(Arrays.asList(1, 3)));
        graph.add(new ArrayList<>(Arrays.asList(0, 1, 4)));
        graph.add(new ArrayList<>());
        graph.add(new ArrayList<>(Collections.singletonList(2)));


        // Act
        List<Deque<Integer>> expected = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(6, 4, 5, 1, 3, 0));
        expected.add(deque);
        deque = new ArrayDeque<>(Arrays.asList(8, 2));
        expected.add(deque);
        deque = new ArrayDeque<>(Collections.singletonList(7));
        expected.add(deque);

        List<Deque<Integer>> connectedComponents = Main.getConnectedComponents(graph);

        // Assert
        for (int i = 0; i < connectedComponents.size(); i++) {
            Deque<Integer> expect = expected.get(i);
            Deque<Integer> result = connectedComponents.get(i);

            Set<Integer> e = new TreeSet<>(expect);
            Set<Integer> r = new TreeSet<>(result);

            Assert.assertEquals(e.toString(), r.toString());
        }
    }

    @Test
    public void TestGraphConnectedComponents1Vertex() {
        // Arrange
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(new ArrayList<>());


        // Act
        List<Deque<Integer>> expected = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>(Collections.singletonList(0));
        expected.add(deque);

        List<Deque<Integer>> connectedComponents = Main.getConnectedComponents(graph);

        // Assert
        for (int i = 0; i < connectedComponents.size(); i++) {
            Deque<Integer> expect = expected.get(i);
            Deque<Integer> result = connectedComponents.get(i);

            Set<Integer> e = new TreeSet<>(expect);
            Set<Integer> r = new TreeSet<>(result);

            Assert.assertEquals(e.toString(), r.toString());
        }
    }

    @Test
    public void TestGraphConnectedComponents0Vertices() {
        // Arrange
        List<List<Integer>> graph = new ArrayList<>();

        // Act
        List<Deque<Integer>> expected = new ArrayList<>();

        List<Deque<Integer>> connectedComponents = Main.getConnectedComponents(graph);

        // Assert
        for (int i = 0; i < connectedComponents.size(); i++) {
            Deque<Integer> expect = expected.get(i);
            Deque<Integer> result = connectedComponents.get(i);

            Set<Integer> e = new TreeSet<>(expect);
            Set<Integer> r = new TreeSet<>(result);

            Assert.assertEquals(e.toString(), r.toString());
        }
    }

    @Test
    public void TestGraphConnectedComponents7Vertices() {
        // Arrange
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(new ArrayList<>());
        graph.add(new ArrayList<>(Arrays.asList(2, 6)));
        graph.add(new ArrayList<>(Collections.singletonList(1)));
        graph.add(new ArrayList<>(Collections.singletonList(4)));
        graph.add(new ArrayList<>(Collections.singletonList(3)));
        graph.add(new ArrayList<>());
        graph.add(new ArrayList<>(Collections.singletonList(1)));


        // Act
        List<Deque<Integer>> expected = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>(Collections.singletonList(0));
        expected.add(deque);
        deque = new ArrayDeque<>(Arrays.asList(2, 6, 1));
        expected.add(deque);
        deque = new ArrayDeque<>(Arrays.asList(4, 3));
        expected.add(deque);
        deque = new ArrayDeque<>(Collections.singletonList(5));
        expected.add(deque);

        List<Deque<Integer>> connectedComponents = Main.getConnectedComponents(graph);

        // Assert
        for (int i = 0; i < connectedComponents.size(); i++) {
            Deque<Integer> expect = expected.get(i);
            Deque<Integer> result = connectedComponents.get(i);

            Set<Integer> e = new TreeSet<>(expect);
            Set<Integer> r = new TreeSet<>(result);

            Assert.assertEquals(e.toString(), r.toString());
        }
    }

    @Test
    public void TestGraphConnectedComponents4Vertices() {
        // Arrange
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        graph.add(new ArrayList<>(Arrays.asList(0, 1, 2, 3)));
        graph.add(new ArrayList<>(Arrays.asList(0, 1, 3)));
        graph.add(new ArrayList<>(Arrays.asList(1, 2)));


        // Act
        List<Deque<Integer>> expected = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(3, 2, 1, 0));
        expected.add(deque);

        List<Deque<Integer>> connectedComponents = Main.getConnectedComponents(graph);

        // Assert
        for (int i = 0; i < connectedComponents.size(); i++) {
            Deque<Integer> expect = expected.get(i);
            Deque<Integer> result = connectedComponents.get(i);

            Set<Integer> e = new TreeSet<>(expect);
            Set<Integer> r = new TreeSet<>(result);

            Assert.assertEquals(e.toString(), r.toString());
        }
    }
}
