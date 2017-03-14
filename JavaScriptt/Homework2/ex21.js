var cardNumber = 47;
for (; cardNumber <= 52; cardNumber++) {
    if (typeof cardNumber == 'number' &&
        cardNumber >= 1 &&
        cardNumber <= 52) {

        var cardValue = Math.floor((cardNumber - 1) / 4) + 2;

        if (cardValue > 10) {
            switch (cardValue) {
                case 11:
                    cardValue = 'J';
                    break;
                case 12:
                    cardValue = 'Q';
                    break;
                case 13:
                    cardValue = 'K';
                    break;
                case 14:
                    cardValue = 'A';
                    break;
            }
        }

        var cardColor = '';
        switch (cardNumber % 4) {
            case 0: cardColor = '\u2660'; break;
            case 1: cardColor = '\u2663'; break;
            case 2: cardColor = '\u2666'; break;
            case 3: cardColor = '\u2665'; break;
        }

        console.log(cardValue + cardColor);

    }
    else {
        console.log("Kyv e toq nomer ve galfon !?")
    }
}