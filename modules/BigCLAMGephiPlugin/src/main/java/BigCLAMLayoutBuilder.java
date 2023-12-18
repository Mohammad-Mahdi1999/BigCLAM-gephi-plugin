import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsBuilder;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service = StatisticsBuilder.class)
public class BigCLAMLayoutBuilder implements org.gephi.statistics.spi.StatisticsBuilder {

    @Override
    public String getName() {
        return "BigCLAM Algorithm";
    }

    @Override
    public Statistics getStatistics() {
        return new BigCLAMPlugin();
    }

    @Override
    public Class<? extends Statistics> getStatisticsClass() {
        return BigCLAMPlugin.class;
    }

}
