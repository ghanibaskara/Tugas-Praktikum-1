//Ghani Baskara Syah
//245150700111008

public class Perpustakaan {
    public static void main(String[] args) {
        //Kategori Teknologi
        //Objek Penulis Buku Teknologi
        Penulis walter = new Penulis("Walter Isaacson");
        Penulis robert = new Penulis("Robert C. Martin");
        Penulis gene = new Penulis("Gene Kim");
        Penulis kevin = new Penulis("Kevin Behr");
        Penulis george = new Penulis("George Spafford");
        Penulis melaine = new Penulis("Melanie Mitchell");
        Penulis nick = new Penulis("Nick Bostrom");
        Penulis brian = new Penulis("Brian Christian");
        Penulis tom = new Penulis("Tom Griffiths");

        //Objek Buku Teknologi
        Buku teknologi1 = new Buku("The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution", walter);
        Buku teknologi2 = new Buku("Clean Code: A Handbook of Agile Software Craftsmanship", robert);
        Buku teknologi3 = new Buku("The Phoenix Project: A Novel About IT, DevOps, and Helping Your Business Win", gene,kevin,george);
        Buku teknologi4 = new Buku("Artificial Intelligence: A Guide for Thinking Humans", melaine);
        Buku Teknologi5 = new Buku("Superintelligence: Paths, Dangers, Strategies", nick);
        Buku Teknologi6 = new Buku("Algorithms to Live By: The Computer Science of Human Decisions", brian,tom);

        //Objek Kategori
        Kategori teknologi = new Kategori("Teknologi", teknologi1,teknologi2,teknologi3,teknologi4,Teknologi5,Teknologi6);
        teknologi.TampilkanDaftarBuku();
        System.out.println();

        //Kategori Filsafat
        //Objek Penulis Buku Filsafat
        Penulis betrand = new Penulis("Bertrand Russell ");
        Penulis thomas = new Penulis("Thomas Nagel");
        Penulis plato = new Penulis("Plato");
        Penulis rolf = new Penulis("Rolf Dobelli");
        Penulis yufal = new Penulis("Yuval Noah Harari");
        Penulis jean = new Penulis("Jean-Paul Sartre");

        //Objek Buku Filsafat
        Buku filsafat1 = new Buku("The Problems of Philosophy", betrand);
        Buku filsafat2 = new Buku("What Does It All Mean? A Very Short Introduction to Philosophy", thomas);
        Buku filsafat3 = new Buku("The Republic", plato);
        Buku filsafat4 = new Buku("The Art of Thinking Clearly", rolf);
        Buku filsafat5 = new Buku("21 Lessons for the 21st Century", yufal);
        Buku filsafat6 = new Buku("Being and Nothingness", jean);
        
        //Objek Kategori
        Kategori filsafat = new Kategori("Filsafat", filsafat1,filsafat2,filsafat3,filsafat4,filsafat5,filsafat6);
        filsafat.TampilkanDaftarBuku();
        System.out.println();

        //Kategori Sejarah
        //Objek Penulis Buku Sejarah
        Penulis jared = new Penulis("Jared Diamond");
        Penulis peter = new Penulis("Peter Frankopan");
        Penulis howard = new Penulis("Howard Zinn");
        Penulis will = new Penulis("Will Durant");
        Penulis ariel = new Penulis("Ariel Durant");

        //Objek Buku Sejarah
        Buku sejarah1 = new Buku("Sapiens: A Brief History of Humankind", yufal);
        Buku sejarah2 = new Buku("Guns, Germs, and Steel: The Fates of Human Societies", jared);
        Buku sejarah3 = new Buku("The Silk Roads: A New History of the World", peter);
        Buku sejarah4 = new Buku("A People's History of the United States", howard);
        Buku sejarah5 = new Buku("The Lessons of History", will,ariel);

        //Objek Kategori
        Kategori Sejarah = new Kategori("Sejarah",sejarah1,sejarah2,sejarah3,sejarah4,sejarah5);
        Sejarah.TampilkanDaftarBuku();
        System.out.println();
        
        //Kategori Agama
        //Objek Penulis Buku Agama
        Penulis karen = new Penulis("Karen Armstrong");
        Penulis lewis = new Penulis("C.S. Lewis");
        Penulis richard = new Penulis("Richard Dawkins");
        Penulis crhistopher = new Penulis("Christopher Hitchens");

        //Objek Buku Agama
        Buku agama1 = new Buku("The Case for God", karen);
        Buku agama2 = new Buku("A History of God: The 4,000-Year Quest of Judaism, Christianity, and Islam", karen);
        Buku agama3 = new Buku("Mere Christianity", lewis);
        Buku agama4 = new Buku("The God Delusion", richard);
        Buku agama5 = new Buku("God Is Not Great: How Religion Poisons Everything", crhistopher);
        
       //Objek Kategori
        Kategori agama = new Kategori("Agama",agama1,agama2,agama3,agama4,agama5);
        agama.TampilkanDaftarBuku();
        System.out.println();

        //Kategori Psikologi
        // Objek Penulis Buku Psikologi
        Penulis daniel = new Penulis("Daniel Kahneman");
        Penulis charles = new Penulis("Charles Duhigg");
        Penulis phillip = new Penulis("Philip Zimbardo");
        Penulis robertb = new Penulis("Robert B. Cialdini");
        Penulis dan = new Penulis("Dan Ariely");
        Penulis amir = new Penulis("Amir Levine");
        Penulis rachel = new Penulis("Rachel Heller");

        //Objek Buku Psikologi
        Buku psikologi1 = new Buku("Thinking, Fast and Slow", daniel);
        Buku psikologi2 = new Buku("The Power of Habit: Why We Do What We Do in Life and Business", charles);
        Buku psikologi3 = new Buku("Predictably Irrational: The Hidden Forces That Shape Our Decisions", dan);
        Buku psikologi4 = new Buku("The Lucifer Effect: Understanding How Good People Turn Evil", phillip);
        Buku psikologi5 = new Buku("Influence: The Psychology of Persuasion", robertb);
        Buku psikologi6 = new Buku("Attached: The New Science of Adult Attachment and How It Can Help You Find—and Keep—Love", amir,rachel);

        //Objek Kategori
        Kategori Psikolgi = new Kategori("Psikologi", psikologi1,psikologi2,psikologi3,psikologi4,psikologi5,psikologi6);
        Psikolgi.TampilkanDaftarBuku();
        System.out.println();

        //Kategori Politik
        //Objek Penulis Kategori Politik
        Penulis niccolo = new Penulis("Niccolò Machiavelli");
        Penulis karl = new Penulis("Karl Marx");
        Penulis friedriche = new Penulis("Friedrich Engels");
        Penulis friedrichh = new Penulis("Friedrich Hayek");
        Penulis alexis = new Penulis("Alexis de Tocqueville");
        Penulis steven = new Penulis("Steven Levitsky");
        Penulis danielz = new Penulis("Daniel Ziblatt");

        //Objek Buku Politik
        Buku politik1 = new Buku("The Prince", niccolo);
        Buku politik2 = new Buku("The Communist Manifesto",karl,friedriche);
        Buku politik3 = new Buku("The Road to Serfdom",friedrichh);
        Buku politik4 = new Buku("The Road to Serfdom",alexis);
        Buku politik5 = new Buku("How Democracies Die", steven,danielz);
        
        //Objek Kategori
        Kategori Politik = new Kategori("Politik",politik1,politik2,politik3,politik4,politik5);
        Politik.TampilkanDaftarBuku();
        System.out.println();

        //Kategori Fiksi
        //Objek Penulis Buku Fiksi
        Penulis scott = new Penulis("F. Scott Fitzgerald");
        Penulis jane = new Penulis("Jane Austen");
        Penulis salinger = new Penulis("J.D. Salinger");
        Penulis gabriel = new Penulis("Gabriel García Márquez");
        Penulis tolkien = new Penulis("J.R.R. Tolkien");
        Penulis rowling = new Penulis("J.K. Rowling");

        //Objek Buku Fiksi
        Buku fiksi1 = new Buku( "The Great Gatsby", scott);
        Buku fiksi2 = new Buku("Pride and Prejudice", jane);
        Buku fiksi3 = new Buku("The Catcher in the Rye", salinger);
        Buku fiksi4 = new Buku("One Hundred Years of Solitude", gabriel);
        Buku fiksi5 = new Buku("The Lord of the Rings", tolkien);
        Buku fiksi6 = new Buku("Harry Potter and the Sorcerer’s Stone", rowling);
        
        //Objek Kategori
        Kategori Fiksi = new Kategori("Fiksi",fiksi1,fiksi2,fiksi3,fiksi4,fiksi5,fiksi6);
        Fiksi.TampilkanDaftarBuku();
       
    }
}
