       def categorie_age(age):
    if age < 5:
        return "Trop jeune"
    elif 5 <= age <= 6:
        return "Débutant"
    elif 7 <= age <= 8:
        return "Poussin"
    elif 9 <= age <= 10:
        return "Benjamin"
    elif 11 <= age <= 12:
        return "Pupille"
    elif 13 <= age <= 14:
        return "Minime"
    elif 15 <= age <= 16:
        return "Cadet"
    elif 17 <= age <= 18:
        return "Junior"
    elif 19 <= age <= 34:
        return "Sénior"
    else:
        return "Vétéran"

# Demander à l'utilisateur de saisir son âge
try:
    age = int(input("Veuillez saisir votre âge : "))
    categorie = categorize_age(age)
    print(f"Vous appartenez à la catégorie : {categorie}")
except ValueError:
    print("Veuillez entrer un nombre valide pour l'âge.")