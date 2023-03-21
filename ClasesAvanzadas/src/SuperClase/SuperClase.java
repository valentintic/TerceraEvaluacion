package SuperClase;

class SuperClase {
    protected int atributo;

    protected int getAtributo() {
        return atributo;
    }

    protected void printValorSuper() {
        System.out.println(atributo);
    }
}

class subClase extends SuperClase {
    protected int atributo;

    public subClase(){
        this.atributo = 30;
        atributo = 50;
        super.atributo = 20;
    }

    public void printValorSuper() {
        super.printValorSuper();
        System.out.println(atributo);
    }
}
