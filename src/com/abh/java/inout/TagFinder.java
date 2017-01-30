package com.abh.java.inout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TagFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            List<String> output = findTags(line);
            if (output.size() == 0) {
                System.out.println("None");
            } else {

                for (String eachOne : output) {
                    System.out.println(eachOne);
                }

            }

            testCases--;
        }
        in.close();

    }

    private static List<String> findTags(String input) {
        List<String> strings = new ArrayList<>();
        while (input.length() > 1) {
            int startTagStart = input.indexOf("<");
            int startTagEnd = input.indexOf(">");
            if (startTagStart > -1 && startTagEnd > -1 && startTagEnd > startTagStart) {
                if (startTagStart + 1 != startTagEnd) {
                    String tag = input.substring(startTagStart + 1, startTagEnd);
                    if (tag.startsWith("/")) {
                        input = input.substring(startTagEnd + 1);
                        continue;
                    }
                    String startTag = "<" + tag + ">";
                    String endTag = "</" + tag + ">";

                    int endTagIndex = input.indexOf(endTag);
                    if (endTagIndex > startTagEnd) {
                        String tagValue = input.substring(startTagEnd + 1, input.indexOf("</" + tag + ">"));
                        if (tagValue.contains(startTag)) {
                            tagValue = tagValue.substring(tagValue.lastIndexOf(startTag) + startTag.length());
                        }
                        if (containsValidTag(tagValue)) {
                            strings.addAll(findTags(tagValue));
                        } else {
                            if (!containsStratTag(tagValue)) {
                                if (tagValue.length() > 0)
                                    strings.add(tagValue);
                            }
                        }
                        input = input.substring(endTagIndex + endTag.length());
                    } else {
                        if (input.length() > startTagEnd + 1) {
                            input = input.substring(startTagEnd + 1);
                        } else {
                            input = "";
                        }
                    }
                } else {
                    if (input.length() > startTagEnd + 1) {
                        input = input.substring(startTagEnd + 1);
                    } else {
                        input = "";
                    }

                }

            } else {
                input = "";
            }
        }
        return strings;
    }

    private static boolean containsValidTag(String input) {
        boolean flag = false;
        int start = input.indexOf("<");
        int end = input.indexOf(">");
        if (start > -1 && end > -1 && end > start && start + 1 != end) {
            String tag = input.substring(start + 1, end);
            if (input.indexOf("</" + tag + ">") > end) {
                String tagValue = input.substring(end + 1, input.indexOf("</" + tag + ">"));
                if (tagValue.length() > 0)
                    flag = true;
            }

        }

        return flag;
    }

    private static boolean containsStratTag(String input) {
        boolean flag = false;
        int start = input.indexOf("<");
        int end = input.indexOf(">");
        if (start > -1 && end > -1 && end > start && start + 1 != end) {
            flag = true;

        }

        return flag;
    }

}
