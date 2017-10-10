package dur.bartlomiej;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    //liczba wierzcholkow
    private Long v;

    //mapa krawedzi
    private Map<Long, List<Long>> e = new HashMap<>();

    //konstruktor ktory przyjmuje liczbe wierzcholkow
    public Graph(Long v) {
        this.v = v;

        for (Long i = 0L; i < v; i++) {
            e.put(i, new ArrayList<Long>());
        }
    }

    //metoda do dodawania krawedzi (graf jest nieskierowany, dlatego dodajemy krawedzie do 2 wierzcholkow)
    public void addEdge(Long v, Long w) {
        e.get(v).add(w);
        e.get(w).add(v);
    }

    public void removeEdge(Long v, Long w) {
        e.get(v).set(e.get(v).indexOf(w), -1L);
        e.get(w).set(e.get(w).indexOf(v), -1L);
    }

    public String printEulerPath() {
        Long u = 0L;
        for (List<Long> i : e.values()) {
            if (i.size() % 2 == 1) {
                u = Long.valueOf(i.size());
                break;
            }
        }
        return printEuler(u) + "\n";
    }

    public String printEuler(Long v) {

        return "";
    }

    public boolean isValid(Long v, Long w) {
        return false;
    }

    //metoda do liczenia dostepnych wierzcholkow z v
    public int DFSCount(Long v, boolean[] visited) {
        //ten wierzcholek odwiedzony
        visited[v.intValue()] = true;
        int count = 1;



        return count;
    }
}
