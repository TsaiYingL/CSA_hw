class Main {
    public static void main(String[] args) {
        Notebook mathNotes = new Notebook(100, false);
        mathNotes.rip(2);
        System.out.println(mathNotes.getTotalPage());

        Notebook csaNotes = new Notebook(100, false);
        csaNotes.drawOnPage(50);

        Notebook.switchClass();
        System.out.println(Notebook.getInBag());
    }
}