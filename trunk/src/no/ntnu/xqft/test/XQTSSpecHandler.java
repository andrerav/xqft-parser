package no.ntnu.xqft.test;

import org.xml.sax.*;
import org.xml.sax.helpers.*;
import org.xml.sax.ext.*;
import java.util.*;

public class XQTSSpecHandler extends DefaultHandler
{

    protected ObservationPoint observationPoint = new ObservationPoint();
    
    public XQTSSpecHandler() {
        super();
    }

    /* (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
     */
    @Override
    public void startElement(String uri, String name, String qname, Attributes attrs) throws SAXException {
        
        boolean shouldFail = false;
        
        if (name.equals("test-case")) {
            if (attrs.getValue("scenario").equals("standard")) {
                shouldFail = false;
            }
            else if (attrs.getValue("scenario").equals("parse-error")) {
                shouldFail = true;                
            }
            else if (attrs.getValue("scenario").equals("trivial")){
                shouldFail = false;                                
            }
            else {
                // Test case not applicable
                return;
            }
            
            /* Build path */
            String file = attrs.getValue("name") + ".xq";
            String filePath = attrs.getValue("FilePath");
            String path = filePath + file;

            /* Create a testcase object to pass to observers */
            TestCase testCase = new TestCase();
            testCase.setName(name);
            testCase.setAttributes(attrs);
            testCase.setPath(path);
            testCase.setShouldFail(shouldFail);
            
            this.observationPoint.forceSetChanged();
            this.observationPoint.notifyObservers(testCase);
                        
        }
        
    }

    /**
     * @return the observationPoint
     */
    public Observable getObservationPoint() {
        return observationPoint;
    }

}