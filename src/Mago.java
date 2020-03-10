public class Mago {

    String nome;
    int vida;
    int ataque;
    int defesa;
    int mana;

    public Mago(String nome, int vida, int ataque, int defesa, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    int atacar(Feiticeiro atacado, Magia magiaUtilizada) {
        int dano = magiaUtilizada.poder * ataque - atacado.defesa;
        if (this.mana < magiaUtilizada.custoDeMana) {
            dano = 0;
        }

        atacado.vida = atacado.vida - dano;

        if (this.mana > magiaUtilizada.custoDeMana) {
            this.mana = mana - magiaUtilizada.custoDeMana;
        };

        return dano;
    }

    int atacar(Druida atacado, Magia magiaUtilizada) {
        int dano = magiaUtilizada.poder * ataque - atacado.defesa;
        atacado.vida = atacado.vida - dano;
        this.mana = mana - magiaUtilizada.custoDeMana;
        return dano;
    }
}