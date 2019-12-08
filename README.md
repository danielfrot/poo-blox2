# poo-blox2-atividade-singleton


Existem 3 tipos de padrões de projetos (gof)
  1 - Criacionais 
        - visam abstrair o processo de criação dos objetos (instanciação)
  2 - Estruturais
        - maneiras de composição e associação de classes e objetos para formação de grandes estruturas (heranças, interfaces)
  3 - Comportamentais
        - define a comunicação e a responsabilidade entre objetos
        

Este projeto se refere ao SINGLETON estando o padrão implementado na classe de LoggerApp presente no projeto

O SINGLETON garante apenas uma instância da classe, um ponto global de acesso de todo o programa.

  Public Class Singleton {
  
      private static Singleton instance;
      
      private Singleton() {
      }
      
      public static Singleton getInstance() {
          if (instance == null) {
              instance = new Singleton();
          }
          return instance;
      }
  
  }
