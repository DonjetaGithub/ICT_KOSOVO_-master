package com.company;
import java.util.Scanner;
import java.util.Vector;

public class LojaBlackJack {

    public static class BlackjackConsole
    {

        private static Scanner scanner = new Scanner(System.in);
        private int[] deck;
        private int currentPosition;
        private Vector dora;

        public static void main(String[] args)
        {
            new BlackjackConsole().run();
        }

        public void run()
        {

            int parat;
            int bast;
            boolean lojtariFiton;

            System.out.println("Mirë se vini në lojën e Blackjack.");
            System.out.println();

            parat = 100;

            while (true)
            {
                System.out.print("Ju keni " + parat + " dollar.");
                do
                {
                    System.out.print("Sa dollarë doni të vini bast? (Futni 0 deri në fund.)");
                    System.out.print("? ");
                    bast = scanner.nextInt();
                    if (bast < 0 || bast > parat)
                    {
                        System.out.print("Përgjigja juaj duhet të jetë midis 0 dhe" + parat + '.');
                    }
                } while (bast < 0 || bast > parat);
                if (bast == 0)
                {
                    break;
                }
                lojtariFiton = playBlackjack();
                if (lojtariFiton)
                {
                    parat = parat + bast;
                } else
                {
                    parat = parat - bast;
                }
                System.out.println();
                if (parat == 0)
                {
                    System.out.println("Me sa duket nuk keni para!");
                    break;
                }
            }

            System.out.println();
            System.out.println("ju largoheni me $" + parat + '.');

        }

        private boolean playBlackjack()
        {

            Vector doraeLojtarit;
            Vector doraePerdoruesit;


            deck = new int[52];
            int cardCt = 0;
            for (int suit = 0; suit <= 3; suit++)
            {
                for (int value = 1; value <= 13; value++)
                {
                    deck[cardCt] = value;
                    cardCt++;
                }
            }
            currentPosition = 0;

            doraeLojtarit = new Vector();
            doraePerdoruesit = new Vector();


            shuffle();

            doraeLojtarit.addElement(dealCard());
            doraeLojtarit.addElement(dealCard());
            doraePerdoruesit.addElement(dealCard());
            doraePerdoruesit.addElement(dealCard());

            System.out.println();
            System.out.println();



            if (value(doraeLojtarit) == 21)
            {
                System.out.print("lojtari tjeter ka " + showCard(getCard(doraeLojtarit, 0)) + " dhe " + showCard(getCard(doraeLojtarit, 1)) + ".");
                System.out.print("Lojtari ka " + showCard(getCard(doraePerdoruesit, 0)) + " dhe " + showCard(getCard(doraePerdoruesit, 1)) + ".");
                System.out.println();
                System.out.print("lojtari ka Blackjack.  Lojtari FITON.");
                return false;
            }

            if (value(doraePerdoruesit) == 21)
            {
                System.out.print("Lojtari ka " + showCard(getCard(doraeLojtarit, 0)) + " dhe " + showCard(getCard(doraeLojtarit, 1)) + ".");
                System.out.print("Perdoruesi ka " + showCard(getCard(doraePerdoruesit, 0)) + " dhe " + showCard(getCard(doraePerdoruesit, 1)) + ".");
                System.out.println();
                System.out.print("Ju keni Blackjack.  Ju FITUAT.");
                return true;
            }
            while (true)
            {
                System.out.println();
                System.out.println();
                System.out.print("Letrat e juaja jane:");
                for (int i = 0; i < doraePerdoruesit.size(); i++)
                {
                    System.out.println("    " + showCard(getCard(doraePerdoruesit, i)));
                }
                System.out.println("Totali i juaj eshte " + value(doraePerdoruesit));
                System.out.println();
                System.out.println("Lojtari eshte duke treguar " + showCard(getCard(doraeLojtarit, 0)));
                System.out.println();
                System.out.print("Godit (H) apo Qendroni (S)?");
                char userAction;
                do
                {
                    userAction = Character.toUpperCase(scanner.next().charAt(0));
                    if (userAction != 'H' && userAction != 'S')
                    {
                        System.out.print("Ju lutem pergjigjuni me H ose S:  ");
                    }
                } while (userAction != 'H' && userAction != 'S');


                if (userAction == 'S')
                {
                    break;
                } else
                {
                    int newCard = dealCard();
                    doraePerdoruesit.addElement(newCard);
                    System.out.println();
                    System.out.println("Lojtari godet.");
                    System.out.println("Letra juaj eshte " + showCard(newCard));
                    System.out.println("Totali juaj eshte " + value(doraePerdoruesit));
                    if (value(doraePerdoruesit) > 21)
                    {
                        System.out.println();
                        System.out.print("Ju u shkatrruat duke kaluar mbi 21. Ju humbet.");
                        System.out.print("Letra tjeter e lojatri ishte " + showCard(getCard(doraeLojtarit, 1)));
                        return false;
                    }
                }

            }

            System.out.println();
            System.out.print("lojtari qendron.");
            System.out.print("Letrat e lojtari jane");
            System.out.println("    " + showCard(getCard(doraeLojtarit, 0)));
            System.out.println("    " + showCard(getCard(doraeLojtarit, 1)));
            while (value(doraeLojtarit) <= 16)
            {
                int newCard = dealCard();
                System.out.print("Lojtari godet dhe merr " + showCard(newCard));
                doraeLojtarit.addElement(newCard);
            }
            System.out.print("Totali i lojtarit eshte " + value(doraeLojtarit));

            System.out.println();
            if (value(doraeLojtarit) > 21)
            {
                System.out.print("Lojtari u shkatërrua duke kaluar mbi 21. Ju fituat.");
                return true;
            } else
            {
                if (value(doraeLojtarit) == value(doraePerdoruesit))
                {
                    System.out.println("Lojtari fitoi  nje barazim. Ti humbe.");
                    return false;
                } else
                {
                    if (value(doraeLojtarit) > value(doraePerdoruesit))
                    {
                        System.out.println("Lojtari fiton, " + value(doraeLojtarit) + " piket " + value(doraePerdoruesit) + ".");
                        return false;
                    } else
                    {
                        System.out.println("Ju fitoni, " + value(doraePerdoruesit) + " piket " + value(doraeLojtarit) + ".");
                        return true;
                    }
                }
            }

        }

        public int dealCard()
        {

            if (currentPosition == 52)
            {
                shuffle();
            }
            currentPosition++;
            return deck[currentPosition - 1];
        }

        public void shuffle()
        {

            for (int i = 51; i > 0; i--)
            {
                int rand = (int) (Math.random() * (i + 1));
                int temp = deck[i];
                deck[i] = deck[rand];
                deck[rand] = temp;
            }
            currentPosition = 0;
        }

        public int getCard(Vector hand, int position)
        {

            if (position >= 0 && position < hand.size())
            {
                return ((Integer)hand.elementAt(position)).intValue();
            } else
            {
                return 0;
            }
        }

        public int value(Vector hand)
        {
            int val;
            boolean ace;

            int cards;

            val = 0;
            ace = false;
            cards = hand.size();

            for (int i = 0; i < cards; i++)
            {

                int card;
                int cardVal;
                card = getCard(hand, i);
                cardVal = getCardValue(card);
                if (cardVal > 10)
                {
                    cardVal = 10;
                }
                if (cardVal == 1)
                {
                    ace = true;
                }
                val = val + cardVal;
            }
            if (ace == true && val + 10 <= 21)
            {
                val = val + 10;
            }

            return val;

        }
        public int getCardValue(int card)
        {
            int rezultati = card;
            switch (card)
            {
                case 11:
                case 12:
                case 13:
                    rezultati =  10;
            }
            return rezultati;
        }
        public String showCard(int card)
        {
            switch (card)
            {
                case 1:
                    return "Ace";
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                case 6:
                    return "6";
                case 7:
                    return "7";
                case 8:
                    return "8";
                case 9:
                    return "9";
                case 10:
                    return "10";
                case 11:
                    return "Jack";
                case 12:
                    return "Mbreteresha";
                case 13:
                    return "Mbreti";
                default:
                    return "??";
            }
        }
    }

}
