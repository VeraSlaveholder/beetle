package Task31;

public class Roles {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result=new StringBuilder();

        for (int i = 0; i < roles.length; i++) {
            result.append(roles[i]).append(":").append("\n");
            for (int j = 0; j < textLines.length; j++) {
                String string1=textLines[j];
                if (string1.startsWith(roles[i]+":")) {
                    String string2=string1.replaceFirst(roles[i]+":",j+1+")");
                    result.append(string2).append("\n");
                }

            }result.append("\n");
        }
        return String.valueOf(result);
    }
}
