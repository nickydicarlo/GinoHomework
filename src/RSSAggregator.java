import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.xmltree.XMLTree;
import components.xmltree.XMLTree1;

public class RSSAggregator {

    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        // TODO clean this up and ask for user input
        out.print("Please enter a valid URL of an RSS aggregation XML: ");
        String inputUrl = in.nextLine();
        XMLTree inputTree = new XMLTree1(inputUrl);


        out.print("Please enter the name of an output file including the .html extension: ");
        String outputFileName = in.nextLine();
        in.close();
        out.close();

    }

    public  static void processAggregate(String inputUrl, String outputUrl){
        /*
        read in the file

        generate new headers/template

        for (each feed to be processed)
            determin filename to use in next line
            RSSReader.processChannel(urlFromTheFeedTag, outputFilenameForFeed);

            link to the resulting file in the output file
         */


    }
}
