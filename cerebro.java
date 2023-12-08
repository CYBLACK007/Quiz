import java.util.List;

    class Pergunta {
        public String texto;
        public List<String> alternativas;
        public String alternativaCerta;

        public Pergunta(String texto, List<String> alternativas, String alternativaCerta) {
            this.texto = texto;
            this.alternativas = alternativas;
            this.alternativaCerta = alternativaCerta;
        }

        public String getTexto() {
            return texto;
        }

        public List<String> getAlternativas() {
            return alternativas;
        }

        public String getAlternativaCerta() {
            return alternativaCerta;
        }
    }

