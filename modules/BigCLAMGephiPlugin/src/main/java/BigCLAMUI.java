import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsUI;
import org.openide.util.lookup.ServiceProvider;

import javax.swing.*;

@ServiceProvider(service = StatisticsUI.class)
public class BigCLAMUI implements StatisticsUI {

    private BigCLAMPluginPanel panel;
    private BigCLAMPlugin myCliqueDetector;

    @Override
    public JPanel getSettingsPanel() {
        panel = new BigCLAMPluginPanel();
        return panel;
    }

    @Override
    public void setup(Statistics ststcs) {
        this.myCliqueDetector = (BigCLAMPlugin) ststcs;
        if (panel != null) {
//            panel.setK(myCliqueDetector.getK());
        }
    }

    @Override
    public void unsetup() {
        if (panel != null) {
//            myCliqueDetector.setK(panel.getK());
        }
        panel = null;
    }

    @Override
    public Class<? extends Statistics> getStatisticsClass() {
        return BigCLAMPlugin.class;
    }

    @Override
    public String getValue() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return "BigCLAM";
    }

    @Override
    public String getShortDescription() {
        return "BigCLAM implementation in gephi";
    }

    @Override
    public String getCategory() {
        return CATEGORY_NETWORK_OVERVIEW;
    }

    @Override
    public int getPosition() {
        return 800;
    }

}
