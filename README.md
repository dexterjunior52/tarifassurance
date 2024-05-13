# tarifassurancedef est_bissextile(annee):
    """
    Vérifie si l'année est bissextile.
    """
    return (annee % 4 == 0 and annee % 100 != 0) or (annee % 400 == 0)

def est_date_valide(jour, mois, annee):
    """
    Vérifie si la date est valide.
    """
    jours_par_mois = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    if mois < 1 or mois > 12:
        return False

    if mois == 2:
        if est_bissextile(annee):
            jours_par_mois[2] = 29
        else:
            jours_par_mois[2] = 28

    if jour < 1 or jour > jours_par_mois[mois]:
        return False

    return True

# Saisie des valeurs par l'utilisateur
jour = int(input("Entrez le numéro de jour : "))
mois = int(input("Entrez le numéro de mois : "))
annee = int(input("Entrez le numéro d'année : "))

if est_date_valide(jour, mois, annee):
    print("La date est valide.")
else:
    print("La date n'est pas valide.")
Code généré par l'IA. Examinez et utilisez soigneusement. Plus d'informations sur la FAQ.
Cet algorithme vérifie si la date saisie par l’utilisateur est valide en tenant compte du nombre de jours dans chaque mois et de l’année bissextile. Si la date est valide, il affiche “La date est valide”, sinon il affiche “La date n’est pas valide”. N’hésitez pas à l’essayer ! 😊




