node {
    stage('Iteracion for') {
        for (int i = 0; i < 5; i++) {
            echo "Iteracion ${i}"
        }
    }

    stage('Iteracion while') {
        int j = 0
        while (j < 5) {
            echo "Iteracion ${j}"
            j++
        }
    }

    stage('Iteracion do-while') {
        int k = 0
        do {
            echo "Iteracion ${k}"
            k++
        } while (k < 5)
    }
}