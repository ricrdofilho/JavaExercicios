package estudiotattoo;
import javax.swing.JOptionPane;
public class EstudioTattoo {
    
    public static void main(String[] args) {
        String strEstiloTattoo, strIndicacao = "", strInformacao, strNome="ESTUDIO TATTOO", strInf="Estudio de tatuagem em Sao Paulo", strOpEstilos = "1 - Blackwork\n2 - Dark\n3 - Fine Line\n4 - Geek\n5 - Lettering\n6 - Neotradicional\n7 - Ornamental\n8 - Realismo\n9 - Tradicional\n10 - Tradicional Americano\n11 - Tradicional Moderna\n";
        int intEscolhaEstilo, intEscolhaInformacao, intResposta, intPronto;
        
        JOptionPane.showMessageDialog(null,strNome + "\n" + strInf);
        JOptionPane.showMessageDialog(null,"Seja bem vindo!\nTe ajudaremos a escolher nosso tatuador que atende sua necessidade");
        
        intResposta = JOptionPane.showConfirmDialog(null, "Voce e maior de idade?", "Verificação de Idade", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); 
        
        if (intResposta == JOptionPane.NO_OPTION){
            
            intResposta = JOptionPane.showConfirmDialog(null,"Voce tem permissao do seu responsavel?", "Verificação de permissao", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if (intResposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null,"Desculpa, voce nao pode fazer uma tatuagem em nosso estudio!");
                System.exit(0);
            }
        }
        
        if (intResposta == JOptionPane.YES_OPTION){
            strEstiloTattoo = "";            
            
            while( ( strEstiloTattoo.equals("") ) || ( strEstiloTattoo.equals("OPCAO INVALIDA!") ) ) {
                
                intEscolhaEstilo = Integer.parseInt(JOptionPane.showInputDialog("Escolha o numero do estilo de tatuagem que voce gostaria de fazer\n    ou digite 12 se quiser saber mais sobre algum dos estilo\n\n" + strOpEstilos + "12 - Me diga mais sobre um dos estilos\n\n"));
            
                switch (intEscolhaEstilo) {
                    case 1: strEstiloTattoo = "Blackwork"; strIndicacao = "a Nicole Tredicci, o Quetz e o Rik."; break;
                    case 2: strEstiloTattoo = "Dark";  strIndicacao = "o Quetz."; break;
                    case 3: strEstiloTattoo = "Fine Line"; strIndicacao = "a Nicole Tredicci."; break; 
                    case 4: strEstiloTattoo = "Geek"; strIndicacao = "o Rik."; break;
                    case 5: strEstiloTattoo = "Lettering"; strIndicacao = "a Rafa Martins."; break;
                    case 6: strEstiloTattoo = "Neotradicional"; strIndicacao = "o Bruno Martins e o Giovanni Gualtieroni."; break; 
                    case 7: strEstiloTattoo = "Ornamental"; strIndicacao = "a Rafa Martins."; break;
                    case 8: strEstiloTattoo = "Realismo"; strIndicacao = "o Bruno Martins."; break;
                    case 9: strEstiloTattoo = "Tradicional"; strIndicacao = "o Quetz."; break;
                    case 10: strEstiloTattoo = "Tradicional Americano"; strIndicacao = "o Diego Jandoza e a Jenifer Campos."; break;
                    case 11: strEstiloTattoo = "Tradicional Moderna"; strIndicacao = "o Diego Jandoza, o Giovanni Gualtieroni, a Jenifer Campos, a Nicole Tredicci e o Rik."; break;
                    case 12: strEstiloTattoo = "informacao"; break;
                    default: strEstiloTattoo = "OPCAO INVALIDA!"; break;
                }
                
                if (strEstiloTattoo.equals("OPCAO INVALIDA!")){
                    JOptionPane.showMessageDialog(null,strEstiloTattoo);
                }
            
                if (strEstiloTattoo.equalsIgnoreCase("informacao")) {
                    intPronto = JOptionPane.NO_OPTION;
                    
                    while (intPronto == JOptionPane.NO_OPTION) {
                        
                        intEscolhaInformacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do estilo que voce quer informacao\n\n" +  strOpEstilos + "\n\n"));
                        
                        switch (intEscolhaInformacao) {
                            case 1: strInformacao = "O Blackswork e um estilo de tatuagem que se caracteriza\npor usar apenas tinta preta ou tonalidades escuras para criar formas\ngeometricas ou desenhos abstratos ou figurativos de alto contraste na pele.\nUtiliza de linhas grossas e solidas para criar designs intrincados,\nfocando na forca das formas em preto, resultando em\ntatuagens de aspecto unico e visualmente impactante."; strEstiloTattoo = ""; break;
                            case 2: strInformacao = "Dark tattoo sao tatuagens que utilizam de cores escuras e temas sombrios,\ncomo o horror, o gotico ou designs que destacam temas\ncomo o medo."; strEstiloTattoo = ""; break;
                            case 3: strInformacao = "Fine Line e um estilo de tatuagem que se destaca pela utilizacao\nde linhas finas e delicadas para criar desenhos detalhados e\nsutis. Geralmente, esse estilo envolve um trabalho de linha preciso e muitas\nvezes apresenta designs minimalistas, retratos e ilustracoes intricadas,\nresultando em tatuagens elegantes e discretas"; strEstiloTattoo = ""; break;
                            case 4: strInformacao = "Geek tattoo se refere a tatuagens que incorporam elementos da\ncultura geek, como personagens de filmes, quadrinhos, videogames,\nsismbolos de series de TV, e outras referencias da cultura pop nerd.\nEssas tatuagens sao uma otima forma de expressao pessoal para quem e\nentusiasta desses universos."; strEstiloTattoo = ""; break;
                            case 5: strInformacao = "Lettering e um estilo de tatuagem que se concentra na criacao\nde letras e palavras como o elemento central do design. Geralmente,\nenvolve a escolha de uma fonte ou estilo de escrita especifico para\ntransmitir uma mensagem, nome ou citacao. Esse estilo e popular\npara tatuagens de frases pessoais, datas significativas ou palavras inspiradoras."; strEstiloTattoo = ""; break;
                            case 6: strInformacao = "Neotradicional e um estilo de tatuagem que combina elementos\nda tatuagem tradicional com uma abordagem moderna. Ele inclui linhas\nousadas, cores vibrantes e detalhes refinados, criando tatuagens com\numa estetica classica, mas com um toque contemporaneo. Geralmente,\nenvolve imagens como flores, animais e retratos com uma\naparencia ousada e nitida."; strEstiloTattoo = ""; break;
                            case 7: strInformacao = "O estilo de tatuagem Ornamental e um estilo que se concentra\nem padroes decorativos, detalhes intricados e designs geometricos,\nmuitas vezes sem representacoes figurativas. O objetivo e criar tatuagens\naltamente ornamentadas e esteticamente complexas, com enfase na estetica\nvisual em vez de imagens especificas."; strEstiloTattoo = ""; break;
                            case 8: strInformacao = "O realismo e um estilo de tatuagem que se esforca para criar\nimagens que parecem extremamente semelhantes a realidade. Isso envolve\na reproducao de detalhes precisos, sombreamento suave e uma tecnica que\nvisa capturar a aparencia exata de objetos, paisagens, retratos ou qualquer\ncoisa que o tatuador esteja representando.\nO objetivo e que a tatuagem pareça uma fotografia ou uma pintura\nhiper-realista na pele."; strEstiloTattoo = ""; break;
                            case 9: strInformacao = "A Tatuagem Tradicional, tambem conhecida como 'Old School', e\num estilo de tatuagem caracterizado por linhas ousadas, cores vivas e\ntemas classicos. Ela inclui contornos nitidos, cores limitadas a uma\npaleta basica ou preta. A Tatuagem Tradicional e conhecida por sua simplicidade\ne estetica atemporal."; strEstiloTattoo = ""; break;
                            case 10: strInformacao = "Tradicional Americano tattoo, também conhecida como 'American\nTraditional', e um estilo classico de tatuagem originado nos EUA no\ninicio do seculo XX e raizes nas tatuagens marinhas. Caracteriza-se por\nlinhas ousadas, cores vividas e temas iconicos, como ancoras, caveiras\ne pin-ups."; strEstiloTattoo = ""; break;
                            case 11: strInformacao = "A tatuagem Tradicional Moderna e uma interpretacao contemporanea\ndo estilo de tatuagem tradicional. Ela mantem a estetica classica,\ncom contornos nitidos, cores ousadas e incorpora elementos modernos,\ncomo detalhes mais elaborados e tecnicas atualizadas. Isso resulta\nem tatuagens que preservam a tradicao,\nmas com um toque fresco e atual."; strEstiloTattoo = ""; break;   
                            default: strInformacao = "OPCAO INVALIDA!"; strEstiloTattoo = "OPCAO INVALIDA!"; break;
                        }
                        
                        if (strEstiloTattoo.equals("OPCAO INVALIDA!")){
                            JOptionPane.showMessageDialog(null,strEstiloTattoo);
                        }
                        
                        if (strEstiloTattoo.equals("")){
                            JOptionPane.showMessageDialog(null,strInformacao);
                            intPronto = JOptionPane.showConfirmDialog(null,"Agora voce esta pronto para escolher o estilo que gostaria de tatuar?", "Está prontro?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);    
                        }
                    }
                } 
            }
            
            JOptionPane.showMessageDialog(null,"Voce tem interesse no estilo " + strEstiloTattoo + "\nPara o estilo " + strEstiloTattoo + ", te indicamos " + strIndicacao + "\n\nVolte sempre!");        
        }
    }
    
}
