import java.util.ArrayList;
import java.util.List;

public class MainGraphHomeWork {
    public static void main(String[] args) {

        NodeGraphSecond a = new NodeGraphSecond(null, "A");
        NodeGraphSecond b = new NodeGraphSecond(null, "Б");
        NodeGraphSecond c = new NodeGraphSecond(null, "В");
        NodeGraphSecond d = new NodeGraphSecond(null, "Г");
        NodeGraphSecond e = new NodeGraphSecond(null, "Д");
        NodeGraphSecond f = new NodeGraphSecond(null, "Е");
        NodeGraphSecond g = new NodeGraphSecond(null, "Ж");
        NodeGraphSecond h = new NodeGraphSecond(null, "З");
        NodeGraphSecond i = new NodeGraphSecond(null, "И");
        NodeGraphSecond j = new NodeGraphSecond(null, "К");

        List<NodeGraphSecond> linksFromA = new ArrayList<>();
        linksFromA.add(b);
        linksFromA.add(c);
        linksFromA.add(d);
        a.setLinks(linksFromA);

        List<NodeGraphSecond> linksFromB = new ArrayList<>();
        linksFromB.add(f);
        linksFromB.add(c);
        b.setLinks(linksFromB);

        List<NodeGraphSecond> linksFromC = new ArrayList<>();
        linksFromC.add(g);
        c.setLinks(linksFromC);

        List<NodeGraphSecond> linksFromD = new ArrayList<>();
        linksFromD.add(h);
        d.setLinks(linksFromD);

        List<NodeGraphSecond> linksFromE = new ArrayList<>();
        linksFromE.add(d);
        linksFromE.add(i);
        e.setLinks(linksFromE);

        List<NodeGraphSecond> linksFromF = new ArrayList<>();
        linksFromF.add(j);
        f.setLinks(linksFromF);

        List<NodeGraphSecond> linksFromG = new ArrayList<>();
        linksFromG.add(j);
        linksFromG.add(h);
        g.setLinks(linksFromG);

        List<NodeGraphSecond> linksFromH = new ArrayList<>();
        linksFromH.add(j);
        h.setLinks(linksFromH);

        List<NodeGraphSecond> linksFromI = new ArrayList<>();
        linksFromI.add(j);
        i.setLinks(linksFromI);

    }
}
