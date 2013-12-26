import org.json.simple.*;
import org.json.simple.parser.*;
import java.util.*;


public class LeadSquaredJSONHelper {
    	private JSONArray leadAttributes = null;
	
	public LeadSquaredJSONHelper ()
	{
		leadAttributes = new JSONArray ();
	}
	
	
	public void addLeadAttribute (String attributeName, String valueOfAttribute)
	{
		JSONObject field = new JSONObject();
		field.put("Attribute", attributeName);
		field.put("Value", valueOfAttribute);
		leadAttributes.add (field);
	}
	
	public String getJSONString()
	{
            if (leadAttributes == null)
                return "{}";
            else
		return leadAttributes.toJSONString();
	}
}
