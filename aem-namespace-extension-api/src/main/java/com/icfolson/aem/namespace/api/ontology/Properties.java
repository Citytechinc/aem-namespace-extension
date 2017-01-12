package com.icfolson.aem.namespace.api.ontology;

public final class Properties {

    private Properties() {

    }

    public static final String RDF_TYPE = Namespace.RDF + ":type";

    /**
     * The classification or type of thing which the Resource intends to represent.  It is good practice
     * to set this to a tag or set of tags and not just a String.
     */
    public static final String CITYTECH_CLASSIFICATION = Namespace.ICF_OLSON + ":classification";

    /**
     * A representation of the Resource in the format of an icon or small image
     */
    public static final String ICF_OLSON_ICONIC_REPRESENTATION = Namespace.ICF_OLSON + ":iconicRepresentation";

    /**
     * Indication of the Brand Resource appropriate to the Resource
     */
    public static final String ICF_OLSON_BRAND = Namespace.ICF_OLSON + ":brand";

    /**
     * Indicates the presumed frequency of change of the associated resource
     */
    public static final String ICF_OLSON_SITEMAP_CHANGE_FREQUENCY = Namespace.ICF_OLSON + ":changeFrequency";

    /**
     * Indicates the priority of the Resource among other resources with indicated priority.
     */
    public static final String ICF_OLSON_SITEMAP_PRIORITY = Namespace.ICF_OLSON + ":priority";

    /**
     * Indicates that a Page should not be indexed by robots such as search-engine crawl bots.
     */
    public static final String ICF_OLSON_HIDDEN_FROM_ROBOTS = Namespace.ICF_OLSON + ":hiddenFromRobots";

    /**
     * Indicates the client library categories prefixing those included for an Authorable Design
     */
    public static final String ICF_OLSON_DESIGN_LIBRARY_PREFIX_CATEGORIES = Namespace.ICF_OLSON + ":designLibraryPrefixCategories";

    /**
     * Indicates the client library categories suffixing those included for an Authorable Design
     */
    public static final String ICF_OLSON_DESIGN_LIBRARY_SUFFIX_CATEGORIES = Namespace.ICF_OLSON + ":designLibrarySuffixCategories";

    /**
     * Indicates the categories which are to be included in the client library of an Authorable Design
     */
    public static final String ICF_OLSON_CLIENT_LIBRARY_CATEGORIES = Namespace.ICF_OLSON + ":clientLibraryCategories";

    /**
     * A multivalue string list of the Javascript files to include in a particular brand
     */
    public static final String ICF_OLSON_BRAND_JAVASCRIPT_FILES = Namespace.ICF_OLSON + ":brandJavascriptFiles";

    /**
     * A multivalue string list of the CSS or LESS files to include in a particular brand
     */
    public static final String ICF_OLSON_BRAND_CSS_FILES = Namespace.ICF_OLSON + ":brandCssFiles";

    public static final String SEMANTIC_PROPERTY = Namespace.ICF_OLSON + ":property";

    public static final String SEMANTIC_TYPEOF = Namespace.ICF_OLSON + ":typeof";

}
