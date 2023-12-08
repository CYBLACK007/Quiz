import java.util.*;

public class back {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pergunta = "O que siginifica a sigla CPU?";

        Collection<String> Alternativas = new ArrayList<>();
        Collection<String> example = new HashSet<>();

        Alternativas.add("Computer Processing Unit");
        Alternativas.add("Center Processing United");
        Alternativas.add("Central Processing Unit");
        Alternativas.add("Component Processing Unit");

        String alternativaCerta = "Central Processing Unit";

        boolean respostaCerta = false;

        do {
            System.out.println(pergunta);

            Collections.shuffle((List<String>) Alternativas);
            for (int i = 0; i < Alternativas.size(); i++) {
                System.out.println("[" + i + "] " + ((List<String>) Alternativas).get(i));
            }

            System.out.println("Digite sua resposta: ");
             String resposta = scanner.nextLine();

             switch (resposta){
                 case "0":
                 case "1":
                 case "2":
                 case "3":
                     int respostaint = Integer.parseInt(resposta);

                     String valordaresposta = ((List<String>) Alternativas).get(respostaint);

                     if ( valordaresposta.equals(alternativaCerta)) {
                         System.out.println("Correto! ");
                         respostaCerta = true;

                     } else {
                         System.out.println("Resposta Errada! ");
                     }
                    break;
                 default:
                     System.out.println("Resposta Inválida. Tente novamente");
                     break;

             }

        }while (!respostaCerta);
    }
}