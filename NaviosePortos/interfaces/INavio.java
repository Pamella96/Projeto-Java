package NaviosePortos.interfaces;

import containers.Container;
import portos.Porto;

public interface INavio {
    boolean sailTo(Porto p);

    void reAbastecer(double novoAbastecer);

    boolean carregarContainer(Container c);

    boolean descarregarContainer(Container c);
}
