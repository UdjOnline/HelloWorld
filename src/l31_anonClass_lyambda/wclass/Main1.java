package l31_anonClass_lyambda.wclass;

interface Greeting {
    void sayHello();
    void sayGoodbye();
}

class Main1 {
    public static void main(String[] args) {
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет из анонимного класса!");
            }

            @Override
            public void sayGoodbye() {
                System.out.println("Пока из анонимного класса!");
            }
        };

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Здравствуйте!");
            }

            @Override
            public void sayGoodbye() {
                System.out.println("Досвидание!");
            }
        };

        Greeting greeting3 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Good morning!");
            }

            @Override
            public void sayGoodbye() {
                System.out.println("Buy!");
            }
        };

        greeting1.sayHello();
        greeting1.sayHello();
        greeting2.sayHello();
        greeting3.sayHello();
        greeting1.sayGoodbye();
        greeting2.sayGoodbye();
        greeting3.sayGoodbye();
    }
}