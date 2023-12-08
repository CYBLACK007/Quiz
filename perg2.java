import java.util.*;

public class perg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pergunta> perguntas = new ArrayList<>();

        // Adicione suas perguntas aqui
        perguntas.add(new Pergunta("O que significa a sigla CPU?",
                Arrays.asList("Computer Processing Unit",
                        "Center Processing United",
                        "Central Processing Unit",
                        "Component Processing Unit"),
                "Central Processing Unit"));

        perguntas.add(new Pergunta("Qual é a capital da França?",
                Arrays.asList("Berlim", "Londres", "Madri", "Paris"),
                "Paris"));


        for (Pergunta pergunta : perguntas) {
            boolean respostaCerta = false;

            do {
                System.out.println(pergunta.getTexto());
                List<String> alternativas = pergunta.getAlternativas();

                Collections.shuffle(alternativas);

                for (int i = 0; i < alternativas.size(); i++) {
                    System.out.println("[" + i + "] " + alternativas.get(i));
                }

                System.out.print("Digite sua resposta: ");
                String resposta = scanner.nextLine();

                try {
                    int respostaint = Integer.parseInt(resposta);

                    if (respostaint >= 0 && respostaint < alternativas.size()) {
                        String valordaresposta = alternativas.get(respostaint);

                        if (valordaresposta.equals(pergunta.getAlternativaCerta())) {
                            System.out.println("Correto!");
                            respostaCerta = true;
                        } else {
                            System.out.println("Resposta Errada!");
                        }
                    } else {
                        System.out.println("Opção Inválida. Tente novamente.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada Inválida. Digite um número.");
                }

            } while (!respostaCerta);
        }
    }
}
