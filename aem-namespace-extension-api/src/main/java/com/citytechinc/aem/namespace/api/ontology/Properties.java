package com.citytechinc.aem.namespace.api.ontology;

public class Properties {

    private Properties() {}

    public static final String RDF_TYPE = Namespace.RDF + ":type";

    /**
     * The classification or type of thing which the Resource intends to represent.  It is good practice
     * to set this to a tag or set of tags and not just a String.
     */
    public static final String CITYTECH_CLASSIFICATION = Namespace.CITYTECH + ":classification";

    /**
     * A representation of the Resource in the format of an icon or small image
     */
    public static final String CITYTECH_ICONIC_REPRESENTATION = Namespace.CITYTECH + ":iconicRepresentation";

    /**
     * Indication of the Brand Resource appropriate to the Resource
     */
    public static final String CITYTECH_BRAND = Namespace.CITYTECH + ":brand";

    /**
     * Indicates the presumed frequency of change of the associated resource
     */
    public static final String CITYTECH_SITEMAP_CHANGE_FREQUENCY = Namespace.CITYTECH + ":changeFrequency";

    /**
     * Indicates the priority of the Resource among other resources with indicated priority.
     */
    public static final String CITYTECH_SITEMAP_PRIORITY = Namespace.CITYTECH + ":priority";

    /**
     * Indicates that a Page should not be indexed by robots such as search-engine crawl bots.
     */
    public static final String CITYTECH_HIDDEN_FROM_ROBOTS = Namespace.CITYTECH + ":hiddenFromRobots";

    /**
     * Indicates the client library categories prefixing those included for an Authorable Design
     */
    public static final String CITYTECH_DESIGN_LIBRARY_PREFIX_CATEGORIES = Namespace.CITYTECH + ":designLibraryPrefixCategories";

    /**
     * Indicates the client library categories suffixing those included for an Authorable Design
     */
    public static final String CITYTECH_DESIGN_LIBRARY_SUFFIX_CATEGORIES = Namespace.CITYTECH + ":designLibrarySuffixCategories";

    /**
     * Indicates the categories which are to be included in the client library of an Authorable Design
     */
    public static final String CITYTECH_CLIENT_LIBRARY_CATEGORIES = Namespace.CITYTECH + ":clientLibraryCategories";

    /**
     * A multivalue string list of the Javascript files to include in a particular brand
     */
    public static final String CITYTECH_BRAND_JAVASCRIPT_FILES = Namespace.CITYTECH + ":brandJavascriptFiles";

    /**
     * A multivalue string list of the CSS or LESS files to include in a particular brand
     */
    public static final String CITYTECH_BRAND_CSS_FILES = Namespace.CITYTECH + ":brandCssFiles";

    public static final String SEMANTIC_PROPERTY = Namespace.CITYTECH + ":property";

    public static final String SEMANTIC_TYPEOF = Namespace.CITYTECH + ":typeof";

}
