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
     * TODO: I don't know why we need this and it probably needs to be removed
     */
    public static final String CITYTECH_SITEMAP_RESOURCE_EXTENSION = Namespace.CITYTECH + ":locExtension";

    /**
     * Indicates the presumed frequency of change of the associated resource
     */
    public static final String CITYTECH_SITEMAP_CHANGE_FREQUENCY = Namespace.CITYTECH + ":changeFrequency";

    /**
     * Indicates the priority of the Resource among other resources with indicated priority.
     */
    public static final String CITYTECH_SITEMAP_PRIORITY = Namespace.CITYTECH + ":priority";

}
