package com.example.melodify.recyclerview

import com.example.melodify.model.CancionHistorial

class HistorialProvider {
    companion object {
        val cancionList: List<CancionHistorial> = listOf(
            CancionHistorial(
                imageUrl = "https://www.top40hitdossier.nl/media/cache/related/uploads/title/23204/original.jpg",
                nombreCancion = "In the end"
            ),
            CancionHistorial(
                imageUrl = "https://upload.wikimedia.org/wikipedia/en/0/0d/Misfits_-_Collection_II_cover.jpg",
                nombreCancion = "Attitude"
            ),
            CancionHistorial(
                imageUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/9eba1a65-e450-4a7e-b6c2-1b201b255fe0/dasi87l-f80699af-f594-4c06-8f09-5621c178354d.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwic3ViIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsImF1ZCI6WyJ1cm46c2VydmljZTpmaWxlLmRvd25sb2FkIl0sIm9iaiI6W1t7InBhdGgiOiIvZi85ZWJhMWE2NS1lNDUwLTRhN2UtYjZjMi0xYjIwMWIyNTVmZTAvZGFzaTg3bC1mODA2OTlhZi1mNTk0LTRjMDYtOGYwOS01NjIxYzE3ODM1NGQucG5nIn1dXX0.kDhsS1lAusuhQhbSZjbb3txZ1aOl2J8NyavO98meMno",
                nombreCancion = "Enter Sandman"
            ),
            CancionHistorial(
                imageUrl = "https://image.iheart.com/ihr-ingestion-pipeline-production-sbmg/A10301A0003993144Z_20190103211149267/56504271.20126.jpg",
                nombreCancion = "Drunk me"
            ),
        )
    }
}