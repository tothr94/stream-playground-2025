package countries.queries.collector;

import java.util.StringJoiner;


/**
 * Defines queries that are related to basic {@link java.util.stream.Collector} instances.
 */
public interface CollectorQueries {
    /**
     * {@return the {@link StringJoiner} instance that collects all the country names, separated by commas}
     */
    StringJoiner getCommaSeparatedNamesAsStringJoiner();

    /**
     * {@return the string that contains all the country names in ascending order, separated by commas}
     */
    String getCommaSeparatedNamesAsString();
}
