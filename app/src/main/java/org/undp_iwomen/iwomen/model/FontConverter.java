package org.undp_iwomen.iwomen.model;

import java.util.ArrayList;
import java.util.List;

public class FontConverter {
	
	static class font{
		private String from;
		private String to;
		
		public font(String from, String to) {
			super();
			this.from = from;
			this.to = to;
		}
		public String getFrom() {
			return from;
		}
		public void setFrom(String from) {
			this.from = from;
		}
		public String getTo() {
			return to;
		}
		public void setTo(String to) {
			this.to = to;
		}
		
	}
	public static String uni2zg1(String unicode)
	{
		List<font> rule = new ArrayList<font>();
	    rule.add(new font("\u1004\u103A\u1039","\u1064"));
	    rule.add(new font("\u1039\u1010\u103D","\u1096"));
	    rule.add(new font("\u1014(?=[\u1030\u103D\u103E\u102F\u1039])","\u108F"));
	    rule.add(new font("\u102B\u103A","\u105A"));
	    rule.add(new font("\u100B\u1039\u100C","\u1092"));
	    rule.add(new font("\u102D\u1036","\u108E"));
	    rule.add(new font("\u104E\u1004\u103A\u1038","\u104E"));
	    rule.add(new font("[\u1025\u1009](?=[\u1039\u102F\u1030])","\u106A"));
	    rule.add(new font("[\u1025\u1009](?=[\u103A])","\u1025"));
	    rule.add(new font("\u100A(?=[\u1039\u102F\u1030\u103D])","\u106B"));
	    rule.add(new font("(\u1039[\u1000-\u1021])\u102F","$1\u1033"));
	    rule.add(new font("(\u1039[\u1000-\u1021])\u1030","$1\u1034"));
	    rule.add(new font("\u1039\u1000","\u1060"));
	    rule.add(new font("\u1039\u1001","\u1061"));
	    rule.add(new font("\u1039\u1002","\u1062"));
	    rule.add(new font("\u1039\u1003","\u1063"));
	    rule.add(new font("\u1039\u1005","\u1065"));
	    rule.add(new font("\u1039\u1007","\u1068"));
	    rule.add(new font("\u1039\u1008","\u1069"));
	    rule.add(new font("\u100A(?=[\u1039\u102F\u1030])","\u106B"));
	    rule.add(new font("\u1039\u100B","\u106C"));
	    rule.add(new font("\u1039\u100C","\u106D"));
	    rule.add(new font("\u100D\u1039\u100D","\u106E"));
	    rule.add(new font("\u100E\u1039\u100D","\u106F"));
	    rule.add(new font("\u1039\u100F","\u1070"));
	    rule.add(new font("\u1039\u1010","\u1071"));
	    rule.add(new font("\u1039\u1011","\u1073"));
	    rule.add(new font("\u1039\u1012","\u1075"));
	    rule.add(new font("\u1039\u1013","\u1076"));
	    rule.add(new font("\u1039\u1013","\u1076"));
	    rule.add(new font("\u1039\u1014","\u1077"));
	    rule.add(new font("\u1039\u1015","\u1078"));
	    rule.add(new font("\u1039\u1016","\u1079"));
	    rule.add(new font("\u1039\u1017","\u107A"));
	    rule.add(new font("\u1039\u1018","\u107B"));
	    rule.add(new font("\u1039\u1019","\u107C"));
	    rule.add(new font("\u1039\u101C","\u1085"));
	    rule.add(new font("\u103F","\u1086"));
	    rule.add(new font("(\u103C)\u103E","$1\u1087"));
	    rule.add(new font("\u103D\u103E","\u108A"));
	    rule.add(new font("(\u1064)([\u1031]?)([\u103C]?)([\u1000-\u1021])\u102D","$2$3$4\u108B"));
	    rule.add(new font("(\u1064)([\u1031]?)([\u103C]?)([\u1000-\u1021])\u102E","$2$3$4\u108C"));
	    rule.add(new font("(\u1064)([\u1031]?)([\u103C]?)([\u1000-\u1021])\u1036","$2$3$4\u108D"));
	    rule.add(new font("\u101B(?=[\u102F\u1030\u103D\u108A])","\u1090"));
	    rule.add(new font("\u100F\u1039\u100D","\u1091"));
	    rule.add(new font("\u100B\u1039\u100B","\u1097"));
	    rule.add(new font("([\u1000-\u1021\u1029\u1090])([\u1060-\u1069\u106C\u106D\u1070-\u107C\u1085\u108A])?([\u103B-\u103E]*)?\u1031","\u1031$1$2$3"));
	    rule.add(new font("([\u1000-\u1021\u1029])([\u1060-\u1069\u106C\u106D\u1070-\u107C\u1085])?(\u103C)","$3$1$2"));
	    rule.add(new font("\u103A","\u1039"));
	    rule.add(new font("\u103B","\u103A"));
	    rule.add(new font("\u103C","\u103B"));
	    rule.add(new font("\u103D","\u103C"));
	    rule.add(new font("\u103E","\u103D"));
	    rule.add(new font("\u103D\u102F","\u1088"));
	    rule.add(new font("([\u102F\u1030\u1014\u101B\u103C\u108A\u103D\u1088])([\u1032\u1036][0,1])\u1037","$1$2\u1095"));
	    rule.add(new font("\u102F\u1095","\u102F\u1094"));
	    rule.add(new font("([\u1014\u101B])([\u1032\u1036\u102D\u102E\u108B\u108C\u108D\u108E])\u1037","$1$2\u1095"));
	    rule.add(new font("\u1095\u1039","\u1094\u1039"));
	    rule.add(new font("([\u103A\u103B])([\u1000-\u1021])\u102F","$1$2\u1033"));
	    rule.add(new font("\u103A\u102F","\u103A\u1033"));
	    rule.add(new font("\u103A([\u1036\u102D\u102E\u108B\u108C\u108D\u108E])\u102F","\u103A$1\u1033"));
	    rule.add(new font("([\u103A\u103B])([\u1000-\u1021])\u1030","$1$2\u1034"));
	    rule.add(new font("\u103A\u1030","\u103A\u1034"));
	    rule.add(new font("\u103A([\u1036\u102D\u102E\u108B\u108C\u108D\u108E])\u1030","\u103A$1\u1034"));
	    rule.add(new font("\u103D\u1030","\u1089"));
	    rule.add(new font("\u103B([\u1000\u1003\u1006\u100F\u1010\u1011\u1018\u101A\u101C\u101A\u101E\u101F])","\u107E$1"));
	    rule.add(new font("\u107E([\u1000\u1003\u1006\u100F\u1010\u1011\u1018\u101A\u101C\u101A\u101E\u101F])([\u103C\u108A])([\u1032\u1036\u102D\u102E\u108B\u108C\u108D\u108E])","\u1084$1$2$3"));
	    rule.add(new font("\u107E([\u1000\u1003\u1006\u100F\u1010\u1011\u1018\u101A\u101C\u101A\u101E\u101F])([\u103C\u108A])","\u1082$1$2"));
	    rule.add(new font("\u107E([\u1000\u1003\u1006\u100F\u1010\u1011\u1018\u101A\u101C\u101A\u101E\u101F])([\u1032\u1036\u102D\u102E\u108B\u108C\u108D\u108E])","\u1080$1$2"));
	    rule.add(new font("\u103B([\u1000-\u1021])([\u103C\u108A])([\u1032\u1036\u102D\u102E\u108B\u108C\u108D\u108E])","\u1083$1$2$3"));
	    rule.add(new font("\u103B([\u1000-\u1021])([\u103C\u108A])","\u1081$1$2"));
	    rule.add(new font("\u103B([\u1000-\u1021])([\u1032\u1036\u102D\u102E\u108B\u108C\u108D\u108E])","\u107F$1$2"));
	    rule.add(new font("\u103A\u103D","\u103D\u103A"));
	    rule.add(new font("\u103A([\u103C\u108A])","$1\u107D"));
	    return replace_with_rule(rule,unicode);
	}
	public static String zg12uni(String zawgyi)
	{
		List<font> rule = new ArrayList<font>();
	    rule.add(new font("(\\u103D|\\u1087)","\u103E"));
	    rule.add(new font("\\u103C","\u103D"));
	    rule.add(new font("(\\u103B|\\u107E|\\u107F|\\u1080|\\u1081|\\u1082|\\u1083|\\u1084)","\u103C"));
	    rule.add(new font("(\\u103A|\\u107D)","\u103B"));
	    rule.add(new font("\\u1039","\u103A"));
	    rule.add(new font("\\u106A","\u1009"));
	    rule.add(new font("\\u106B","\u100A"));
	    rule.add(new font("\\u106C","\u1039\u100B"));
	    rule.add(new font("\\u106D","\u1039\u100C"));
	    rule.add(new font("\\u106E","\u100D\u1039\u100D"));
	    rule.add(new font("\\u106F","\u100D\u1039\u100E"));
	    rule.add(new font("\\u1070","\u1039\u100F"));
	    rule.add(new font("(\\u1071|\\u1072)","\u1039\u1010"));
	    rule.add(new font("\\u1060","\u1039\u1000"));
	    rule.add(new font("\\u1061","\u1039\u1001"));
	    rule.add(new font("\\u1062","\u1039\u1002"));
	    rule.add(new font("\\u1063","\u1039\u1003"));
	    rule.add(new font("\\u1065","\u1039\u1005"));
	    rule.add(new font("\\u1068","\u1039\u1007"));
	    rule.add(new font("\\u1069","\u1039\u1008"));
	    rule.add(new font("/(\\u1073|\\u1074)/g","\u1039\u1011"));
	    rule.add(new font("\\u1075","\u1039\u1012"));
	    rule.add(new font("\\u1076","\u1039\u1013"));
	    rule.add(new font("\\u1077","\u1039\u1014"));
	    rule.add(new font("\u1078","\u1039\u1015"));
	    rule.add(new font("\u1079","\u1039\u1016"));
	    rule.add(new font("\u107A","\u1039\u1017"));
	    rule.add(new font("\u107C","\u1039\u1019"));
	    rule.add(new font("\u1085","\u1039\u101C"));
	    rule.add(new font("\u1033","\u102F"));
	    rule.add(new font("\u1034","\u1030"));
	    rule.add(new font("\u103F","\u1030"));
	    rule.add(new font("\u1086","\u103F"));
	    rule.add(new font("\u1088","\u103E\u102F"));
	    rule.add(new font("\u1089","\u103E\u1030"));
	    rule.add(new font("\u108A","\u103D\u103E"));
	    rule.add(new font("([\u1000-\u1021])\u1064","\u1004\u103A\u1039$1"));
	    rule.add(new font("([\u1000-\u1021])\u108B","\u1004\u103A\u1039$1\u102D"));
	    rule.add(new font("([\u1000-\u1021])\u108C","\u1004\u103A\u1039$1\u102E"));
	    rule.add(new font("([\u1000-\u1021])\u108D","\u1004\u103A\u1039$1\u1036"));
	    rule.add(new font("\u108E","\u102D\u1036"));
	    rule.add(new font("\u108F","\u1014"));
	    rule.add(new font("\u1090","\u101B"));
	    rule.add(new font("\u1091","\u100F\u1039\u1091"));
	    rule.add(new font("\u1019\u102C(\u107B|\u1093)","\u1019\u1039\u1018\u102C"));
	    rule.add(new font("(\u107B|\u1093)","\u103A\u1018"));
	    rule.add(new font("(\u1094|\u1095)","\u1037"));
	    rule.add(new font("\u1096","\u1039\u1010\u103D"));
	    rule.add(new font("\u1097","\u100B\u1039\u100B"));
	    rule.add(new font("\u103C([\u1000-\u1021])([\u1000-\u1021])?","$1\u103C$2"));
	    rule.add(new font("([\u1000-\u1021])\u103C\u103A","\u103C$1\u103A"));
	    rule.add(new font("\u1031([\u1000-\u1021])(\u103E)?(\u103B)?","$1$2$3\u1031"));
	    rule.add(new font("([\u1000-\u1021])\u1031(\u103B|\u103C|\u103D)","$1$2\u1031"));
	    rule.add(new font("\u1032\u103D","\u103D\u1032"));
	    rule.add(new font("\u103D\u103B","\u103B\u103D"));
	    rule.add(new font("\u103A\u1037","\u1037\u103A"));
	    rule.add(new font("\u102F(\u102D|\u102E|\u1036|\u1037)\u102F","\u102F$1"));
	    rule.add(new font("\u102F\u102F","\u102F"));
	    rule.add(new font("(\u102F|\u1030)(\u102D|\u102E)","$2$1"));
	    rule.add(new font("(\u103E)(\u103B|\u1037)","$2$1"));
	    rule.add(new font("\u1025(\u103A|\u102C)","\u1009$1"));
	    rule.add(new font("\u1025\u102E","\u1026"));
	    rule.add(new font("\u1005\u103B","\u1008"));
	    rule.add(new font("\u1036(\u102F|\u1030)","$1\u1036"));
	    rule.add(new font("\u1031\u1037\u103E","\u103E\u1031\u1037"));
	    rule.add(new font("\u1031\u103E\u102C","\u103E\u1031\u102C"));
	    rule.add(new font("\u105A","\u102B\u103A"));
	    rule.add(new font("\u1031\u103B\u103E","\u103B\u103E\u1031"));
	    rule.add(new font("(\u102D|\u102E)(\u103D|\u103E)","$2$1"));
	    rule.add(new font("\u102C\u1039([\u1000-\u1021])","\u1039$1\u102C"));
	    rule.add(new font("\u103C\u1004\u103A\u1039([\u1000-\u1021])","\u1004\u103A\u1039$1\u103C"));
	    rule.add(new font("\u1039\u103C\u103A\u1039([\u1000-\u1021])","\u103A\u1039$1\u103C"));
	    rule.add(new font("\u103C\u1039([\u1000-\u1021])","\u1039$1\u103C"));
	    rule.add(new font("\u1036\u1039([\u1000-\u1021])","\u1039$1\u1036"));
	    rule.add(new font("\u1092","\u100B\u1039\u100C"));
	    rule.add(new font("\u104E","\u104E\u1004\u103A\u1038"));
	    rule.add(new font("\u1040(\u102B|\u102C|\u1036)","\u101D$1"));
	    rule.add(new font("\u1025\u1039","\u1009\u1039"));
	    return replace_with_rule(rule,zawgyi);
	}
	private static String replace_with_rule(List<font> rule, String output) {
	    int max_loop = rule.size();
	    String new_out = null;
	    for(int i=0; i < max_loop; i++) {
	      font data = rule.get(i);
	      /*String from = "~"+json_decode('"'+data.getFrom()+'"')+"~u";
	      String to = json_decode('"'+data.getTo()+'"');
	      String output = from preg_replace($from,$to,$output);*/
	      new_out = output.replaceAll(data.getFrom(), data.getTo());
	    }
	    return new_out;
	}
    
    public static String uni512zg1(String input_text) {
    	String output_text = input_text;
    	output_text = output_text.replaceAll("\\u104e\\u1004\\u103a\\u1038", "\u104e");
    	output_text = output_text.replaceAll("\\u102b\\u103a", "\u105a");
    	output_text = output_text.replaceAll("\\u102d\\u1036", "\u108e");
    	output_text = output_text.replaceAll("\\u103f", "\u1086");
    	output_text = output_text.replaceAll("(?<=\\u102f)\\u1037", "\u1094");
    	output_text = output_text.replaceAll("(?<=\\u102f\\u1036)\\u1037", "\u1094");
    	output_text = output_text.replaceAll("(?<=\\u1030)\\u1037", "\u1094");
    	output_text = output_text.replaceAll("(?<=\\u1030\\u1036)\\u1037", "\u1094");
    	output_text = output_text.replaceAll("(?<=\\u1014)\\u1037", "\u1094");
    	output_text = output_text.replaceAll("(?<=\\u1014[\\u103a\\u1032])\\u1037", "\u1094");
    	output_text = output_text.replaceAll("(?<=\\u103b)\\u1037", "\u1095");
    	output_text = output_text.replaceAll("(?<=\\u103b[\\u1032\\u1036])\\u1037", "\u1095");
    	output_text = output_text.replaceAll("(?<=\\u103d)\\u1037", "\u1095");
    	output_text = output_text.replaceAll("(?<=\\u103d[\\u1032])\\u1037", "\u1095");
    	output_text = output_text.replaceAll("(?<=[\\u103b\\u103c\\u103d])\\u102f", "\u1033");
    	output_text = output_text.replaceAll("(?<=[\\u103b\\u103c\\u103d][\\u102d\\u1036])\\u102f", "\u1033");
    	output_text = output_text.replaceAll("(?<=(\\u1039[\\u1000-\\u1021]))\\u102f", "\u1033");
    	output_text = output_text.replaceAll("(?<=(\\u1039[\\u1000-\\u1021])[\\u102d\\u1036])\\u102f", "\u1033");
    	output_text = output_text.replaceAll("(?<=[\\u100a\\u100c\\u1020\\u1025\\u1029])\\u102f", "\u1033");
    	output_text = output_text.replaceAll("(?<=[\\u100a\\u100c\\u1020\\u1025\\u1029][\\u102d\\u1036])\\u102f", "\u1033");
    	output_text = output_text.replaceAll("(?<=[\\u103b\\u103c])\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=[\\u103b\\u103c][\\u103d])\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=[\\u103b\\u103c][\\u103e])\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=[\\u103b\\u103c][\\u102d\\u1036])\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=[\\u103b\\u103c][\\u103d][\\u103e])\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=[\\u103b\\u103c][\\u103d][\\u102d\\u1036])\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=[\\u103b\\u103c][\\u103e][\\u102d\\u1036])\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=[\\u103b\\u103c][\\u103d][\\u103e][\\u102d\\u1036])\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=(\\u1039[\\u1000-\\u1021]))\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=(\\u1039[\\u1000-\\u1021])[\\u102d\\u1036])\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=[\\u100a\\u100c\\u1020\\u1025\\u1029])\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=[\\u100a\\u100c\\u1020\\u1025\\u1029][\\u102d\\u1036])\\u1030", "\u1034");
    	output_text = output_text.replaceAll("(?<=\\u103c)\\u103e", "\u1087");
    	output_text = output_text.replaceAll("\\u1009(?=[\\u103a])", "\u1025");
    	output_text = output_text.replaceAll("\\u1009(?=\\u1039[\\u1000-\\u1021])", "\u1025");
    	output_text = output_text.replaceAll("([\\u1000-\\u1021\\u1029])((?:\\u1039[\\u1000-\\u1021])?)((?:[\\u103b-\\u103e\\u1087]*)?)\\u1031", "\u1031$1$2$3");
    	output_text = output_text.replaceAll("([\\u1000-\\u1021\\u1029])((?:\\u1039[\\u1000-\\u1021\\u1000-\\u1021])?)(\\u103c)", "$3$1$2");
    	output_text = output_text.replaceAll("\\u1004\\u103a\\u1039", "\u1064");
    	output_text = output_text.replaceAll("(\\u1064)((?:\\u1031)?)((?:\\u103c)?)([\\u1000-\\u1021])\\u102d", "$2$3$4\u108b");
    	output_text = output_text.replaceAll("(\\u1064)((?:\\u1031)?)((?:\\u103c)?)([\\u1000-\\u1021])\\u102e", "$2$3$4\u108c");
    	output_text = output_text.replaceAll("(\\u1064)((?:\\u1031)?)((?:\\u103c)?)([\\u1000-\\u1021])\\u1036", "$2$3$4\u108d");
    	output_text = output_text.replaceAll("(\\u1064)((?:\\u1031)?)((?:\\u103c)?)([\\u1000-\\u1021])", "$2$3$4\u1064");
    	output_text = output_text.replaceAll("\\u100a(?=[\\u1039\\u102f\\u1030])", "\u106b");
    	output_text = output_text.replaceAll("\\u100a", "\u100a");
    	output_text = output_text.replaceAll("\\u101b(?=[\\u102f\\u1030])", "\u1090");
    	output_text = output_text.replaceAll("\\u101b", "\u101b");
    	output_text = output_text.replaceAll("\\u1014(?=[\\u1039\\u103d\\u103e\\u102f\\u1030])", "\u108f");
    	output_text = output_text.replaceAll("\\u1014", "\u1014");
    	output_text = output_text.replaceAll("\\u1039\\u1000", "\u1060");
    	output_text = output_text.replaceAll("\\u1039\\u1001", "\u1061");
    	output_text = output_text.replaceAll("\\u1039\\u1002", "\u1062");
    	output_text = output_text.replaceAll("\\u1039\\u1003", "\u1063");
    	output_text = output_text.replaceAll("\\u1039\\u1005", "\u1065");
    	output_text = output_text.replaceAll("\\u1039\\u1006", "\u1066");
    	output_text = output_text.replaceAll("(?<=[\\u1001\\u1002\\u1004\\u1005\\u1007\\u1012\\u1013\\u108f\\u1015\\u1016\\u1017\\u1019\\u101d])\\u1066", "\u1067");
    	output_text = output_text.replaceAll("\\u1039\\u1007", "\u1068");
    	output_text = output_text.replaceAll("\\u1039\\u1008", "\u1069");
    	output_text = output_text.replaceAll("\\u1039\\u100f", "\u1070");
    	output_text = output_text.replaceAll("\\u1039\\u1010", "\u1071");
    	output_text = output_text.replaceAll("(?<=[\\u1001\\u1002\\u1004\\u1005\\u1007\\u1012\\u1013\\u108f\\u1015\\u1016\\u1017\\u1019\\u101d])\\u1071", "\u1072");
    	output_text = output_text.replaceAll("\\u1039\\u1011", "\u1073");
    	output_text = output_text.replaceAll("(?<=[\\u1001\\u1002\\u1004\\u1005\\u1007\\u1012\\u1013\\u108f\\u1015\\u1016\\u1017\\u1019\\u101d])\\u1073", "\u1074");
    	output_text = output_text.replaceAll("\\u1039\\u1012", "\u1075");
    	output_text = output_text.replaceAll("\\u1039\\u1013", "\u1076");
    	output_text = output_text.replaceAll("\\u1039\\u1014", "\u1077");
    	output_text = output_text.replaceAll("\\u1039\\u1015", "\u1078");
    	output_text = output_text.replaceAll("\\u1039\\u1016", "\u1079");
    	output_text = output_text.replaceAll("\\u1039\\u1017", "\u107a");
    	output_text = output_text.replaceAll("\\u1039\\u1018", "\u107b");
    	output_text = output_text.replaceAll("\\u1039\\u1019", "\u107c");
    	output_text = output_text.replaceAll("\\u1039\\u101c", "\u1085");
    	output_text = output_text.replaceAll("\\u100f\\u1039\\u100d", "\u1091");
    	output_text = output_text.replaceAll("\\u100b\\u1039\\u100c", "\u1092");
    	output_text = output_text.replaceAll("\\u1039\\u100c", "\u106d");
    	output_text = output_text.replaceAll("\\u100b\\u1039\\u100b", "\u1097");
    	output_text = output_text.replaceAll("\\u1039\\u100b", "\u106c");
    	output_text = output_text.replaceAll("\\u100e\\u1039\\u100d", "\u106f");
    	output_text = output_text.replaceAll("\\u100d\\u1039\\u100d", "\u106e");
    	output_text = output_text.replaceAll("\\u1009(?=\\u103a)", "\u1025");
    	output_text = output_text.replaceAll("\\u1025(?=[\\u1039\\u102f\\u1030])", "\u106a");
    	output_text = output_text.replaceAll("\\u1025", "\u1025");
    	output_text = output_text.replaceAll("\\u103a", "\u1039");
    	output_text = output_text.replaceAll("\\u103b\\u103d\\u103e", "\u107d\u108a");
    	output_text = output_text.replaceAll("\\u103d\\u103e", "\u108a");
    	output_text = output_text.replaceAll("\\u103b", "\u103a");
    	output_text = output_text.replaceAll("\\u103c", "\u103b");
    	output_text = output_text.replaceAll("\\u103d", "\u103c");
    	output_text = output_text.replaceAll("\\u103e", "\u103d");
    	output_text = output_text.replaceAll("\\u103a(?=[\\u103c\\u103d\\u108a])", "\u107d");
    	output_text = output_text.replaceAll("(?<=\\u100a(?:[\\u102d\\u102e\\u1036\\u108b\\u108c\\u108d\\u108e]))\\u103d", "\u1087");
    	output_text = output_text.replaceAll("(?<=\\u100a)\\u103d", "\u1087");
    	output_text = output_text.replaceAll("\\u103b(?=[\\u1000\\u1003\\u1006\\u100f\\u1010\\u1011\\u1018\\u101a\\u101c\\u101e\\u101f\\u1021])", "\u107e");
    	output_text = output_text.replaceAll("\\u107e([\\u1000-\\u1021\\u108f])(?=[\\u102d\\u102e\\u1036\\u108b\\u108c\\u108d\\u108e])", "\u1080$1");
    	output_text = output_text.replaceAll("\\u107e([\\u1000-\\u1021\\u108f])(?=[\\u103c\\u108a])", "\u1082$1");
    	output_text = output_text.replaceAll("\\u103b([\\u1000-\\u1021\\u108f])(?=[\\u102d\\u102e\\u1036\\u108b\\u108c\\u108d\\u108e])", "\u107f$1");
    	output_text = output_text.replaceAll("\\u103b([\\u1000-\\u1021\\u108f])(?=[\\u103c\\u108a])", "\u1081$1");
    	output_text = output_text.replaceAll("(?<=\\u1014)\\u1037", "\u1094");
    	output_text = output_text.replaceAll("(?<=\\u1014[\\u103a\\u1032])\\u1037", "\u1094");
    	output_text = output_text.replaceAll("(?<=\\u1033)\\u1094", "\u1095");
    	output_text = output_text.replaceAll("(?<=\\u1033[\\u1036])\\u1094", "\u1095");
    	output_text = output_text.replaceAll("(?<=\\u1034)\\u1094", "\u1095");
    	output_text = output_text.replaceAll("(?<=\\u1034[\\u1036])\\u1094", "\u1095");
    	output_text = output_text.replaceAll("(?<=[\\u103c\\u103d\\u108a])\\u1037", "\u1095");
    	output_text = output_text.replaceAll("(?<=[\\u103c\\u103d\\u108a][\\u1032])\\u1037", "\u1095");
    	return output_text;
     }
     
     public static String zg12uni51(String input_text) {
    	String output_text = input_text;
    	output_text = output_text.replaceAll("\\u103D\\u103C", "\u103E\u1031");
    	output_text = output_text.replaceAll("\\u106a", "\u1009");
    	output_text = output_text.replaceAll("\\u1025(?=[\\u1039\\u102c])", "\u1009");
    	output_text = output_text.replaceAll("\\u1025\\u102e", "\u1026");
    	output_text = output_text.replaceAll("\\u106b", "\u100a");
    	output_text = output_text.replaceAll("\\u1090", "\u101b");
    	output_text = output_text.replaceAll("\\u1040", "\u1040");
    	output_text = output_text.replaceAll("\\u108f", "\u1014");
    	output_text = output_text.replaceAll("\\u1012", "\u1012");
    	output_text = output_text.replaceAll("\\u1013", "\u1013");
    	output_text = output_text.replaceAll("[\\u103d\\u1087]", "\u103e");
    	output_text = output_text.replaceAll("\\u103c", "\u103d");
    	output_text = output_text.replaceAll("[\\u103b\\u107e\\u107f\\u1080\\u1081\\u1082\\u1083\\u1084]", "\u103c");
    	output_text = output_text.replaceAll("[\\u103a\\u107d]", "\u103b");
    	output_text = output_text.replaceAll("\\u103d\\u103b", "\u103b\u103d");
    	output_text = output_text.replaceAll("\\u108a", "\u103d\u103d");
    	output_text = output_text.replaceAll("\\u103d\\u103d", "\u103d\u103d");
    	output_text = output_text.replaceAll("((?:\\u1031)?)((?:\\u103c)?)([\\u1000-\\u1021])\\u1064", "\u1064$1$2$3");
    	output_text = output_text.replaceAll("((?:\\u1031)?)((?:\\u103c)?)([\\u1000-\\u1021])\\u108b", "\u1064$1$2$3\u102d");
    	output_text = output_text.replaceAll("((?:\\u1031)?)((?:\\u103c)?)([\\u1000-\\u1021])\\u108c", "\u1064$1$2$3\u102e");
    	output_text = output_text.replaceAll("((?:\\u1031)?)((?:\\u103c)?)([\\u1000-\\u1021])\\u108d", "\u1064$1$2$3\u1036");
    	output_text = output_text.replaceAll("\\u105a", "\u102b\u103a");
    	output_text = output_text.replaceAll("\\u108e", "\u102d\u1036");
    	output_text = output_text.replaceAll("\\u1033", "\u102f");
    	output_text = output_text.replaceAll("\\u1034", "\u1030");
    	output_text = output_text.replaceAll("\\u1088", "\u103d\u102f");
    	output_text = output_text.replaceAll("\\u1089", "\u103d\u1030");
    	output_text = output_text.replaceAll("\\u1039", "\u103a");
    	output_text = output_text.replaceAll("[\\u1094\\u1095]", "\u1037");
    	output_text = output_text.replaceAll("([\\u1000-\\u1021])([\\u102c\\u102d\\u102e\\u1032\\u1036]){1,2}([\\u1060\\u1061\\u1062\\u1063\\u1065\\u1066\\u1067\\u1068\\u1069\\u1070\\u1071\\u1072\\u1073\\u1074\\u1075\\u1076\\u1077\\u1078\\u1079\\u107a\\u107b\\u107c\\u1085])", "$1$3$2");
    	output_text = output_text.replaceAll("\\u1064", "\u1004\u103a\u1039");
    	output_text = output_text.replaceAll("\\u104e", "\u104e\u1004\u103a\u1038");
    	output_text = output_text.replaceAll("\\u1086", "\u103f");
    	output_text = output_text.replaceAll("\\u1060", "\u1039\u1000");
    	output_text = output_text.replaceAll("\\u1061", "\u1039\u1001");
    	output_text = output_text.replaceAll("\\u1062", "\u1039\u1002");
    	output_text = output_text.replaceAll("\\u1063", "\u1039\u1003");
    	output_text = output_text.replaceAll("\\u1065", "\u1039\u1005");
    	output_text = output_text.replaceAll("[\\u1066\\u1067]", "\u1039\u1006");
    	output_text = output_text.replaceAll("\\u1068", "\u1039\u1007");
    	output_text = output_text.replaceAll("\\u1069", "\u1039\u1008");
    	output_text = output_text.replaceAll("\\u106c", "\u1039\u100b");
    	output_text = output_text.replaceAll("\\u1070", "\u1039\u100f");
    	output_text = output_text.replaceAll("[\\u1071\\u1072]", "\u1039\u1010");
    	output_text = output_text.replaceAll("[\\u1073\\u1074]", "\u1039\u1011");
    	output_text = output_text.replaceAll("\\u1075", "\u1039\u1012");
    	output_text = output_text.replaceAll("\\u1076", "\u1039\u1013");
    	output_text = output_text.replaceAll("\\u1077", "\u1039\u1014");
    	output_text = output_text.replaceAll("\\u1078", "\u1039\u1015");
    	output_text = output_text.replaceAll("\\u1079", "\u1039\u1016");
    	output_text = output_text.replaceAll("\\u107a", "\u1039\u1017");
    	output_text = output_text.replaceAll("\\u107b", "\u1039\u1018");
    	output_text = output_text.replaceAll("\\u107c", "\u1039\u1019");
    	output_text = output_text.replaceAll("\\u1085", "\u1039\u101c");
    	output_text = output_text.replaceAll("\\u106d", "\u1039\u100c");
    	output_text = output_text.replaceAll("\\u1091", "\u100f\u1039\u100d");
    	output_text = output_text.replaceAll("\\u1092", "\u100b\u1039\u100c");
    	output_text = output_text.replaceAll("\\u1097", "\u100b\u1039\u100b");
    	output_text = output_text.replaceAll("\\u106f", "\u100e\u1039\u100d");
    	output_text = output_text.replaceAll("\\u106e", "\u100d\u1039\u100d");
    	output_text = output_text.replaceAll("(\\u103c)([\\u1000-\\u1021])((?:\\u1039[\\u1000-\\u1021])?)", "$2$3$1");
    	output_text = output_text.replaceAll("(\\u103d)(\\u103d)([\\u103b\\u103c])", "$3$2$1");
    	output_text = output_text.replaceAll("(\\u103d)([\\u103b\\u103c])", "$2$1");
    	output_text = output_text.replaceAll("(\\u103d)([\\u103b\\u103c])", "$2$1");
    	//output_text = output_text.replaceAll("(?<=([\\u1000-\\u101c\\u101e-\\u102a\\u102c\\u102e-\\u103d\\u104c-\\u109f]))(\\u1040)(?=\\s)?", "\u101d");
    	//output_text = output_text.replaceAll("(?<=(\\u101d))(\\u1040)(?=\\s)?", "\u101d");
    	//output_text = output_text.replaceAll("(?<=([\\u1000-\\u101c\\u101e-\\u102a\\u102c\\u102e-\\u103d\\u104c-\\u109f\\s]))(\\u1047)", "\u101b");
    	output_text = output_text.replaceAll("(\\u1047)(?=[\\u1000-\\u101c\\u101e-\\u102a\\u102c\\u102e-\\u103d\\u104c-\\u109f\\s])", "\u101b");
    	output_text = output_text.replaceAll("((?:\\u1031)?)([\\u1000-\\u1021])((?:\\u1039[\\u1000-\\u1021])?)((?:[\\u102d\\u102e\\u1032])?)([\\u1036\\u1037\\u1038]{0,2})([\\u103b-\\u103d]{0,3})((?:[\\u102f\\u1030])?)([\\u1036\\u1037\\u1038]{0,2})((?:[\\u102d\\u102e\\u1032])?)", "$2$3$6$1$4$9$7$5$8");
    	output_text = output_text.replaceAll("\\u1036\\u102f", "\u102f\u1036");
    	output_text = output_text.replaceAll("(\\u103a)(\\u1037)", "$2$1");
    	return output_text;
     }

	//Zawgyi to Unicode correction
	public static String Correction(String InputStr)
	{
		/// Correction
		InputStr=InputStr.replaceAll("([ြ]?)([က-အ])","$2$1");
		InputStr=InputStr.replaceAll("([ေ])([က-အ])([ြ-ှ]*)","$2$3$1");
		InputStr=InputStr.replaceAll("([ရလ])([ြ])([ါ-းွှ]+)([က-အ])","$1$3$4$2");//for ရြှိပီး
		InputStr=InputStr.replaceAll("([က-အ])([ါ-း]+)([ျ-ှ])","$1$3$2");//////for ကိုျး
		InputStr=InputStr.replaceAll("([က-အ])([ေ])([ိ-ူဲံ])","$2$1$3");//////for ‌နနေဲ
		InputStr=InputStr.replaceAll("([က-အ])([ေ])([ိ-ူဲံ]?)([က-အ])([်])","$2$1$3$4$5");//////for ‌‌သပေန်း
		InputStr=InputStr.replaceAll("([က-အ])([က-အ])([ေ])([ါာ])","$1$3$2$4");//////for ‌လပေါ
		InputStr=InputStr.replaceAll("ရြုံဖ", "ရုံဖြ"); //   ရြုံဖ
		InputStr=InputStr.replaceAll("([ခ])([ြ])([ဲ့]+)([က-အ])","$1$3$4$2");//for /ခြဲ့က
		InputStr=InputStr.replaceAll("([က-အ])([ါာ])([္])([က-အ])","$1$3$4$2");//for မာ္ဘ့
		InputStr=InputStr.replaceAll("([ုူ့])([ိီဲံ])","$2$1");
		InputStr=InputStr.replaceAll("ဥ([္်])","ဉ$1");
		InputStr=InputStr.replaceAll("ံု","ုံ");//ဆံု
		InputStr=InputStr.replaceAll("့်","့်");//င့်  င့် ဒ
		InputStr=InputStr.replaceAll("([က-အ])ှေျ","$1ျှေ");//မှေျာ
		InputStr=InputStr.replaceAll("([က-အ])ျ်","$1်ျ");// က်ျာကျ်ာ
		InputStr=InputStr.replaceAll("([ွှ])([ျြ])","$2$1");//ၽ
		InputStr=InputStr.replaceAll("\u200C","");
		InputStr=InputStr.replaceAll("ြြ", "ြ");
		InputStr=InputStr.replaceAll("ုု", "ု");
		//End
		return InputStr;
	}



}
