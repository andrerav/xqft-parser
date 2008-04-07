package no.ntnu.xqft.test;

import org.xml.sax.Attributes;

public class TestCase {
    protected String name;
    protected Attributes attributes;
    protected String path;
    protected boolean shouldFail;
    
    /**
     * @return the shouldFail
     */
    public boolean shouldFail() {
        return shouldFail;
    }
    /**
     * @param shouldFail the shouldFail to set
     */
    public void setShouldFail(boolean shouldFail) {
        this.shouldFail = shouldFail;
    }
    /**
     * @return the attributes
     */
    public Attributes getAttributes() {
        return attributes;
    }
    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }
    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
}
